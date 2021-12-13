import me.zhenxin.qqbot.core.AccessInfo;
import me.zhenxin.qqbot.core.ApiManager;
import me.zhenxin.qqbot.core.BotCore;
import me.zhenxin.qqbot.core.EventHandler;
import me.zhenxin.qqbot.event.AtMessageEvent;
import me.zhenxin.qqbot.entity.Message;
import me.zhenxin.qqbot.entity.ark.MessageArk;
import me.zhenxin.qqbot.template.TextThumbnailTemplate;

class Example {
    public static void main(String[] args) {
        AccessInfo accessInfo = new AccessInfo();
        accessInfo.setBotAppId(0); // 管理端的BotAppId
        accessInfo.setBotToken(""); // 管理端的BotToken
        accessInfo.setUseSandBoxMode(true); // 使用沙盒模式
        // 创建实例
        BotCore bot = new BotCore(accessInfo);
        // 获取API管理器
        ApiManager api = bot.getApiManager();
        // 注册AT消息相关事件
        bot.registerAtMessageEvent();
        // 设置事件处理器
        bot.setEventHandler(new IEventHandler(api));
        // 启动
        bot.start();
    }
}

// 自定义事件处理器 继承EventHandler
class IEventHandler extends EventHandler {
    private final ApiManager api;

    public IEventHandler(ApiManager api) {
        this.api = api;
    }

    @Override
    public void onAtMessage(AtMessageEvent event) {
        Message message = event.getMessage();
        String channelId = message.getChannelId();
        String content = message.getContent();
        String messageId = message.getId();

        if (content.contains("ping")) {
            // 文本消息
            api.getMessageApi()
                    .sendTextMessage(channelId, "pong!", messageId);
        } else if (content.contains("ark")) {
            // 模板消息
            MessageArk ark = TextThumbnailTemplate.builder()
                    .build()
                    .toMessageArk();
            api.getMessageApi()
                    .sendTemplateMessage(channelId, ark, messageId);
        }
    }
}