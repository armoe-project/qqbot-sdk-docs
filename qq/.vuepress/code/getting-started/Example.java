class Example {
    public static void main(String[] args) {
        AccessInfo accessInfo = new AccessInfo();
        accessInfo.setBotAppId(0); // 管理端的BotAppId
        accessInfo.setBotToken(""); // 管理端的BotToken
        // 使用沙盒模式
        accessInfo.useSandBoxMode();
        // 创建实例
        BotCore bot = new BotCore(accessInfo);
        // 获取API管理器
        ApiManager api = bot.getApiManager();
        // 注册AT消息相关事件
        bot.registerAtMessageEvent();
        // 设置事件处理器
        IEventHandler handler = new IEventHandler();
        // handler.setRemoveAt(false); // 取消删除消息中的艾特
        bot.setEventHandler(handler);
        // 启动
        bot.start();
    }
}

// 自定义事件处理器 继承EventHandler
@Slf4j
@AllArgsConstructor
class IEventHandler extends EventHandler {
    private final ApiManager api;

    @Override
    public void onAtMessage(AtMessageEvent event) {
        Message message = event.getMessage();
        String guildId = message.getGuildId();
        String channelId = message.getChannelId();
        String content = message.getContent();
        String messageId = message.getId();
        User author = message.getAuthor();
        super.onAtMessage(event);
        try {
            String[] args = content.split(" ");
            String command = args[0];
            switch (command) {
                case "ping":
                    api.getMessageApi()
                            .sendMessage(channelId, "pong", messageId);
                    break;
            }
        } catch (ApiException e) {
            log.error("消息处理发生异常: {} {}({})", e.getCode(), e.getMessage(), e.getError());
            api.getMessageApi().sendMessage(channelId, "消息处理失败: " + e.getMessage(), messageId);
        }
    }
}