fun main() {
    val accessInfo = AccessInfo().apply {
        botAppId = 0 // 管理端的BotAppId
        botToken = "" // 管理端的BotToken
    }
    // 创建实例
    val bot = BotCore(accessInfo)
    // 获取API管理器
    val api = bot.apiManager
    // 使用沙盒模式
    bot.useSandBoxMode()
    // 注册AT消息相关事件
    bot.registerAtMessageEvent()
    // 设置事件处理器
    bot.setEventHandler(IEventHandler(api))
    // 启动
    bot.start()
}

// 自定义事件处理器 继承EventHandler
@Logger
class IEventHandler(private val api: ApiManager) : EventHandler() {
    override fun onAtMessage(event: AtMessageEvent) {
        val message = event.message
        val guildId = message.guildId
        val channelId = message.channelId
        val content = message.content
        val messageId = message.id
        val author = message.author
        super.onAtMessage(event)
        try {
            val args = content.split(" ")
            val command = args[0]
            when (command) {
                "info" -> api.messageApi
                    .sendTextMessage(channelId, JSONUtil.toJsonStr(message), messageId)
                "ping" -> api.messageApi
                    .sendTextMessage(channelId, "pong", messageId)
                "ark" -> {
                    val ark = TextThumbnailTemplate.builder()
                        .build().toMessageArk()
                    api.messageApi
                        .sendTemplateMessage(channelId, ark, messageId)
                }
            }
        } catch (e: ApiException) {
            log.error { "消息处理发生异常: ${e.code} ${e.message}(${e.error})" }
            api.messageApi.sendTextMessage(channelId, "消息处理失败: ${e.message}", messageId)
        }
    }
}