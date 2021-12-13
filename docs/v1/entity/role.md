---
title: 身份组对象(Role)
author: 真心
date: 2021-12-13
---

| 字段        | 类型    | 描述                                      |
| ----------- | ------- | ----------------------------------------- |
| id          | String  | 身份组ID 默认值见[官方文档][defaultroles] |
| name        | String  | 身份组名称                                |
| color       | Long    | 身份组颜色                                |
| hoist       | Integer | 是否在成员列表中显示                      |
| number      | Integer | 人数                                      |
| memberLimit | Integer | 成员上限                                  |


[defaultroles]: https://bot.q.qq.com/wiki/develop/api/openapi/guild/role_model.html#defaultroles