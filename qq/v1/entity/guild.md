---
title: 频道对象(Guild)
author: 真心
date: 2021-12-13
---

| 字段           | 类型          | 描述               |
| -------------- | ------------- | ------------------ |
| id             | String        | 频道ID             |
| name           | String        | 频道名称           |
| icon           | String        | 频道头像地址       |
| ownerId        | String        | 创建人用户ID       |
| owner          | Boolean       | 当前人是否是创建人 |
| memberCount    | Integer       | 成员数             |
| maxMemberCount | Integer       | 最大成员数         |
| description    | String        | 简介               |
| joinedAt       | LocalDateTime | 加入时间           |
