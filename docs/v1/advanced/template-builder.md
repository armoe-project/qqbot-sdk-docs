---
title: 模板构建
author: 真心
date: 2021-12-13
---

模板构建器是为了方便开发者构建 [MessageArk](../entity/message-ark.md) 消息实体而设计的。

创建一个Ark消息非常简单，只需要调用模板对象的 builder() 方法即可.

```java
MessageArk ark = TextThumbnailTemplate.builder()
            .desc("测试消息") // 描述
            .prompt("[小叶]Ark测试") // 外部看到的提示
            .title("你好啊") // 标题
            .metaDesc("欢迎使用小叶机器人!") // 简介
            .img("https://b.armoe.cn/assets/image/logo.png") // 图片链接
            .link("https://sdk.armoe.cn/qq/") // 跳转链接
            .subTitle("自豪的使用 QQ Official Bot SDK") // 左下角子标题
            .build()
            .toMessageArk();
    // 发送Ark消息
    api.getMessageApi()
            .sendTemplateMessage(channelId, ark, messageId);
```

当前支持以下模板

* TextThumbnailTemplate
* BigImageTemplate
* LinkTextTemplate

具体字段可查看 [官方文档][official-docs]

[official-docs]: https://bot.q.qq.com/wiki/develop/api/openapi/message/message_template.html