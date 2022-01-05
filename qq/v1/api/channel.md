---
title: 子频道API
author: 真心
date: 2022-1-5
---

## 获取子频道信息
```java
/**
 * 获取子频道信息
 *
 * @param channelId 子频道ID
 * @return 子频道对象
 */
public Channel getChannelInfo(String channelId)
```

## 获取子频道列表
```java
/**
 * 获取子频道列表
 *
 * @param guildId 频道ID
 * @return 子频道对象数组
 */
public List<Channel> getChannelList(String guildId)
```

## 创建子频道
```java
/**
 * 创建子频道 (仅私域可用)
 *
 * @param guildId  频道ID
 * @param name     子频道名称
 * @param type     子频道类型 (<a href="https://bot.q.qq.com/wiki/develop/api/openapi/channel/model.html#c
 * @param position 子频道排序
 * @param parentId 分组ID
 * @return 子频道对象
 */
public Channel createChannel(String guildId, String name, String type, int position, String parentId)
```

## 修改子频道
```java
/**
 * 修改子频道 (仅私域可用)
 *
 * @param channelId 子频道ID
 * @param name      子频道名称
 * @param type      子频道类型
 * @param position  子频道排序
 * @param parentId  分组ID
 * @return 子频道对象
 */
public Channel updateChannel(String channelId, String name, String type, int position, String parentId)
```

## 删除子频道
```java
/**
 * 删除子频道 (仅私域可用)
 *
 * @param channelId 子频道ID
 */
public void deleteChannel(String channelId)
```