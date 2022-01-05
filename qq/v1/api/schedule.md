---
title: 日程API
author: 真心
date: 2022-1-5
---

## 获取日程列表
```java
/**
 * 获取日程列表
 *
 * @param channelId 子频道ID
 * @param since     起始时间 可为null
 * @return 日程对象数组
 */
public List<Schedule> getScheduleList(String channelId, Long since)
```

## 获取日程信息
```java
/**
 * 获取日程信息
 *
 * @param channelId 子频道ID
 * @param scheduleId 日程ID
 * @return 日程对象
 */
public Schedule getScheduleInfo(String channelId, String scheduleId)
```



