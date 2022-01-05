---
title: 频道API
author: 真心
date: 2021-12-13
---

## 获取频道信息

```java
/**
* 获取频道信息
*
* @param guildId 频道ID
*/
public Guild getGuildInfo(String guildId)
```

## 获取频道成员列表

```java
/**
* 获取频道成员列表 (仅私域可用)
* @param guildId 频道ID
* @param limit   返回的成员数量 (1-1000)
*/
public List<Member> getGuildMembers(String guildId, Integer limit) throws ApiException

/**
 * 获取频道成员列表 (仅私域可用)
 * @param after 上一次请求返回的最后一个成员的ID
 * @param limit 返回的成员数量 (1-1000)
 */
public List<Member> getGuildMembers(String guildId, String after, Integer limit) throws ApiException 
```