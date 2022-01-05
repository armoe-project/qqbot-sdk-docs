---
title: 子频道权限API
author: 真心
date: 2022-1-5
---

## 获取子频道权限
```java
/**
 * 获取子频道权限
 *
 * @param channelId 子频道ID
 * @param userId    用户ID
 * @return 子频道权限对象
 */
public ChannelPermissions getChannelPermissions(String channelId, String userId)
```

## 添加子频道权限
```java
/**
 * 添加子频道权限
 *
 * @param channelId   子频道ID
 * @param userId      用户ID
 * @param permissions 权限
 */
public void addChannelPermissions(String channelId, String userId, Integer permissions)
```

## 移除子频道权限
```java
/**
 * 移除子频道权限
 *
 * @param channelId   子频道ID
 * @param userId      用户ID
 * @param permissions 权限
 */
public void removeChannelPermissions(String channelId, String userId, Integer permissions)
```

