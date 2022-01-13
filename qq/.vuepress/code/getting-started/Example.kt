fun main() {
    val accessInfo = AccessInfo().apply {
        botAppId = 0 // 管理端的BotAppId
        botToken = "" // 管理端的BotToken
        useSandBoxMode() // 使用沙盒模式
    }
    // 创建实例
    val bot = BotCore(accessInfo)
    // 获取API管理器
    val api = bot.apiManager
    // 注册AT消息相关事件
    bot.registerAtMessageEvent()
    // 设置事件处理器
    val handler = IEventHandler(api)
    // handler.removeAt = false; // 取消删除消息中的艾特
    bot.setEventHandler(handler)
    // 启动
    bot.start()
}

// 自定义事件处理器 继承EventHandler
@Logger
class IEventHandler(private val api: ApiManager) : EventHandler() {

    // 处理错误
    override fun onError(t: Throwable) {
        log.error("发生错误: {}", t.message)
        t.printStackTrace()
    }

    override fun onAtMessage(event: AtMessageEvent) {
        val message = event.message
        val guildId = message.guildId
        val channelId = message.channelId
        val content = message.content
        val messageId = message.id
        val author = message.author
        try {
            val args = content.split(" ")
            val command = args[0]
            when (command) {
                "ping" -> api.messageApi.sendMessage(
                    channelId,
                    "pong",
                    messageId
                )
            }
        } catch (e: ApiException) {
            log.error { "消息处理发生异常: ${e.code} ${e.message}(${e.error})" }
            api.messageApi.sendMessage(channelId, "消息处理失败: ${e.message}", messageId)
        }
    }
}