---
title: 公告API
author: 真心
date: 2021-12-13
---

## 创建频道全局公告
```java
/**
* 创建频道全局公告
* @param guildId   频道ID
* @param channelId 子频道ID
* @param messageId 消息ID
*/
public Announces createGuildAnnounces(String guildId, String channelId, String messageId) throws ApiException
```

## 删除频道全局公告
```java
/**
* 删除频道全局公告
* @param guildId   频道ID
* @param messageId 消息ID
*/
public void deleteGuildAnnounces(String guildId, String messageId) throws ApiException
```

## 创建子频道公告

```java
/**
* 创建子频道公告
* @param channelId 频道ID
* @param messageId 消息ID
*/
public Announces createAnnounces(String channelId, String messageId)
```

## 删除子频道公告

```java
/**
* 删除子频道公告
* @param channelId 频道ID
* @param messageId 消息ID
*/
public void deleteAnnounces(String channelId, String messageId)
```