import me.zhenxin.qqbot.core.AccessInfo
import me.zhenxin.qqbot.core.ApiManager
import me.zhenxin.qqbot.core.BotCore
import me.zhenxin.qqbot.core.EventHandler
import me.zhenxin.qqbot.event.AtMessageEvent
import me.zhenxin.qqbot.template.TextThumbnailTemplate

fun main() {
    val accessInfo = AccessInfo().apply {
        botAppId = 0 // 管理端的BotAppId
        botToken = "" // 管理端的BotToken
        useSandBoxMode = true // 使用沙盒模式
    }
    // 创建实例
    val bot = BotCore(accessInfo)
    // 获取API管理器
    val api = bot.apiManager
    // 注册AT消息相关事件
    bot.registerAtMessageEvent()
    // 设置事件处理器
    bot.setEventHandler(IEventHandler(api))
    // 启动
    bot.start()
}

// 自定义事件处理器 继承EventHandler
class IEventHandler(private val api: ApiManager) : EventHandler() {

    override fun onUserMessage(event: AtMessageEvent) {
        val message = event.message
        val channelId = message.channelId
        val content = message.content
        val messageId = message.id

        if (content.contains("ping")) {
            // 文本消息
            api.messageApi
                .sendTextMessage(channelId, "pong!", messageId)
        } else if (content.contains("ark")) {
            // 模板消息
            val ark = TextThumbnailTemplate.builder()
                .build()
                .toMessageArk();
            api.messageApi
                .sendTemplateMessage(channelId, ark, messageId);
        }
    }
}