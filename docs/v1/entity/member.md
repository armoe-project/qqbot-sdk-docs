---
title: 成员对象(Member)
author: 真心
date: 2021-12-13
---

| 字段     | 类型            | 描述                   |
| -------- | --------------- | ---------------------- |
| guildId  | String          | 频道ID                 |
| user     | [User](user.md) | 用户基础信息           |
| nick     | String          | 用户在频道内的昵称     |
| roles    | String 数组     | 用户在频道内的身份组ID |
| joinedAt | LocalDateTime   | 用户加入频道的时间     |
