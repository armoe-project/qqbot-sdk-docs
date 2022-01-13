object Example {
  def main(args: Array[String]): Unit = {
    val accessInfo = new AccessInfo
    accessInfo.setBotAppId(0) // 管理端的BotAppId
    accessInfo.setBotToken("") // 管理端的BotToken
    // 使用沙盒模式
    accessInfo.useSandBoxMode()
    // 创建实例
    val bot = new BotCore(accessInfo)
    // 获取API管理器
    val api = bot.getApiManager
    // 注册AT消息相关事件
    bot.registerIntents(
      Intent.AT_MESSAGES
    )
    // 设置事件处理器
    val handler = new IEventHandler(api)
    // handler.setRemoveAt(false) // 取消删除消息中的艾特
    bot.setEventHandler(handler)
    // 启动
    bot.start()
  }
}

class IEventHandler(api: ApiManager) extends EventHandler {
  private val log = LoggerFactory.getLogger(this.getClass)

  override def onAtMessage(event: AtMessageEvent): Unit = {
    val message = event.getMessage
    val guildId = message.getGuildId
    val channelId = message.getChannelId
    val content = message.getContent
    val messageId = message.getId
    val author = message.getAuthor
    try {
      val args = content.split(" ")
      val command = args(0)
      command match {
        case "ping" => api.getMessageApi.sendMessage(
          channelId,
          "pong",
          messageId
        )
      }
    } catch {
      case e: ApiException => {
        log.error(s"消息处理发生异常: ${e.getCode} ${e.getMessage}(${e.getError})")
        api.getMessageApi.sendMessage(
          channelId,
          s"消息处理失败: ${e.getMessage}",
          messageId)
      }
    }
  }
}