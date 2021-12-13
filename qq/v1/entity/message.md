---
title: 消息对象(Message)
author: 真心
date: 2021-12-13
---

| 字段            | 类型                                            | 描述                  |
| --------------- | ----------------------------------------------- | --------------------- |
| id              | String                                          | 消息ID                |
| channelId       | String                                          | 子频道ID              |
| guildId         | String                                          | 频道ID                |
| content         | String                                          | 消息内容              |
| timestamp       | Long                                            | 消息创建时间          |
| editedTimestamp | Long                                            | 消息编辑时间          |
| mentionEveryone | Boolean                                         | 是否为 @全体成员 消息 |
| author          | [User](user.md)                                 | 消息创建人            |
| attachments     | [MessageAttachment](message-attachment.md) 数组 | 消息附件              |
| embeds          | [MessageEmbed](message-embed.md) 数组           | 消息Embed             |
| mentions        | [User](user.md) 数组                            | 消息中@的人           |
| member          | [Member](member.md)                             | 消息创建者的信息      |
| ark             | [MessageArk](message-ark.md)                    | Ark消息               |
