---
title: 事件列表
author: WhkSoft
date: 2021-12-31
---

### 消息
* 用户消息: `UserMessageEvent` (仅限[私域机器人][私域]可用)
* 艾特消息: `AtMessageEvent`

### 子频道
* 子频道创建: `ChannelCreateEvent`
* 子频道更新: `ChannelUpdateEvent`
* 子频道删除: `ChannelDeleteEvent`

### 频道
* 新增频道: `GuildCreateEvent`
* 频道更新: `GuildUpdateEvent`
* 退出频道: `GuildDeleteEvent`

### 频道成员
* 频道成员加入: `GuildMemberAddEvent`
* 频道成员更新: `GuildMemberUpdateEvent`
* 频道成员退出: `GuildMemberRemoveEvent`

### 表情表态
* 消息表态增加: `MessageReactionAddEvent`
* 消息表态移除: `MessageReactionRemoveEvent`



[私域]: https://docs.qq.com/doc/DU2duQUJjbUFuV1RL
