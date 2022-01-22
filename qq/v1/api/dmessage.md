---
title: 私信API
author: 真心
date: 2022-1-22
---

## 创建私信会话
```java
/**
* 创建私信会话
*
* @param recipientId 接收者ID
* @param guildId     源频道ID
* @return {@link DirectMessageSession} 对象
*/
public DirectMessageSession createSession(String recipientId, String guildId)
```

## 发送文本消息
```java
/**
* 发送文本消息
*
* @param guildId   频道ID
* @param content   文本内容
* @param messageId 消息ID
* @return {@link Message} 对象
*/
public Message sendMessage(String guildId, String content, String messageId)
```

## 发送图片消息
```java
/**
* 发送图片消息
*
* @param guildId   频道ID
* @param image     图片URL
* @param messageId 消息ID
* @return 消息对象
*/
public Message sendMessage(String guildId, URL image, String messageId)
```

## 发送文本和图片消息
```java
/**
* 发送文本和图片消息
*
* @param guildId   频道ID
* @param content   文本内容
* @param image     图片URL
* @param messageId 消息ID
* @return 消息对象
*/
public Message sendMessage(String guildId, String content, URL image, String messageId)
```

## 发送模板(Ark)消息
```java
/**
* 发送模板(Ark)消息
*
* @param guildId   频道ID
* @param ark       MessageArk对象
* @param messageId 消息ID
* @return 消息对象
*/
public Message sendMessage(String guildId, MessageArk ark, String messageId)
```

## 发送 Embed 消息

```java
/**
* 发送 Embed 消息
*
* @param guildId   频道ID
* @param embed     Embed 消息
* @param messageId 消息ID
* @return 消息对象
*/
public Message sendMessage(String guildId, MessageEmbed embed, String messageId)
```
