---
title: 用户API
author: 真心
date: 2022-1-5
---

## 获取机器人信息
```java
/**
 * 获取机器人信息
 *
 * @return 用户对象
 */
public User getMeInfo()
```
## 获取机器人已加入频道列表
```java
/**
 * 获取机器人已加入频道列表
 *
 * @return 频道对象数组
 */
public List<Guild> getMeGuilds()
```

## 获取机器人已加入频道列表
```java
/**
 * 获取机器人已加入频道列表
 * before/after 参数仅能存在一个, 如果两个都存在，则会抛出异常
 *
 * @param after  频道ID (读此ID之后的数据)
 * @param before 频道ID (读此ID之前的数据)
 * @return 频道对象数组
 */
public List<Guild> getMeGuilds(String after, String before)
```