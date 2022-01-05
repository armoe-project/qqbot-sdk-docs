---
title: 消息API
author: 真心
date: 2021-12-13
---

## 发送消息

```java
/**
* 发送文本消息
*
* @param channelId 子频道ID
* @param content   文本内容
* @param messageId 消息ID
* @return 消息对象
*/
public Message sendMessage(String channelId, String content, String messageId)

/**
* 发送图片消息
*
* @param channelId 子频道ID
* @param image     图片URL
* @param messageId 消息ID
* @return 消息对象
*/
public Message sendMessage(String channelId, URL image, String messageId)

/**
* 发送文本和图片消息
*
* @param channelId 子频道ID
* @param content   文本内容
* @param image     图片URL
* @param messageId 消息ID
* @return 消息对象
*/
public Message sendMessage(String channelId, String content, URL image, String messageId)
```

## 发送模板消息

模板对象构建方法详见 [模板构建](../advanced/template-builder.md)

```java
/**
* 发送模板(Ark)消息
*
* @param channelId 子频道ID
* @param ark       MessageArk对象
* @param messageId 消息ID
* @return Message对象
*/
public Message sendTemplateMessage(String channelId, MessageArk ark, String messageId)
```

## 发送嵌套消息
```java
/**
 * 发送 Embed 消息
 *
 * @param channelId 子频道ID
 * @param embed     Embed 消息
 * @param messageId 消息ID
 * @return 消息对象
 */
public Message sendMessage(String channelId, MessageEmbed embed, String messageId) throws ApiException
```

## 撤回消息
```java
/**
 * 撤回消息
 * @param channelId 子频道ID
 * @param messageId 消息ID
 */
public void deleteMessage(String channelId, String messageId) throws ApiException
```