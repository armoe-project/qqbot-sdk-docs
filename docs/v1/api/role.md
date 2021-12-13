---
title: 身份组API
author: 真心
date: 2021-12-13
---

## 获取身份组列表

```java
/**
* 获取身份组列表
*
* @param guildId 频道ID
* @return 身份组列表(RoleList)对象
*/
public RoleList getRoles(String guildId)
```

## 创建身份组

```java
/**
* 创建身份组
*
* @param guildId 频道ID
* @param name    身份组名称
* @param color   身份组颜色 ARGB的HEX值
* @param hoist   是否在成员列表单独显示
*/
public Role createRole(String guildId, String name, Long color, Boolean hoist)
```

## 修改身份组

```java
/**
* 修改身份组
*
* @param guildId 频道ID
* @param roleId  身份组ID
* @param name    身份组名称
* @param color   身份组颜色 ARGB的HEX值
* @param hoist   是否在成员列表单独显示
*/
public Role changeRole(String guildId, String roleId, String name, Long color, Boolean hoist)
```

## 删除身份组

```java
/**
* 删除身份组
*
* @param guildId 频道ID
* @param roleId  身份组ID
*/
public void deleteRole(String guildId, String roleId)
```

## 增加身份组成员

```java
/**
* 增加身份组成员
*
* @param guildId   频道ID
* @param userId    用户ID
* @param roleId    身份组ID
* @param channelId 子频道ID (如果roleId为5[子频道管理员]，则为设置的子频道。否则参数无效)
*/
public void addRoleMember(String guildId, String userId, String roleId, String channelId)
```

## 删除身份组成员

```java
/**
* 删除身份组成员
*
* @param guildId   频道ID
* @param userId    用户ID
* @param roleId    身份组ID
* @param channelId 子频道ID (如果roleId为5[子频道管理员]，则为设置的子频道。否则参数无效)
*/
public void deleteRoleMember(String guildId, String userId, String roleId, String channelId)
```
