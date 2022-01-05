---
title: 成员API
author: 真心
date: 2021-12-13
---

## 获取成员信息

```java
/**
* 获取成员信息
*
* @param guildId 频道ID
* @param userId  用户ID
*/
public Member getMemberInfo(String guildId, String userId)
```

## 删除频道成员

```java
/**
 * 删除频道成员 (仅私域可用)
 *
 * @param guildId 频道ID
 * @param userId  用户ID
 */
public void deleteMember(String guildId, String userId) throws ApiException
```