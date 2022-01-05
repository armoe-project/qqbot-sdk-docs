---
title: 禁言API
author: 真心
date: 2022-1-5
---

## 全员禁言
```java
/**
 * 全员禁言
 *
 * @param guildId  频道ID
 * @param duration 禁言时长，单位秒，0为解除禁言
 */
public void muteAll(String guildId, Integer duration)
```

## 禁言
```java
/**
 * 禁言
 *
 * @param guildId  频道ID
 * @param userId   用户ID
 * @param duration 禁言时长，单位秒，0为解除禁言
 */
public void mute(String guildId, String userId, Integer duration)
```
