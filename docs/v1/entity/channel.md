---
title: 子频道对象(Announces)
author: 真心
date: 2021-12-13
---

| 字段     | 类型                                          | 描述                                        |
| -------- | --------------------------------------------- | ------------------------------------------- |
| id       | String                                        | 子频道ID                                    |
| guildId  | String                                        | 频道ID                                      |
| name     | String                                        | 子频道名称                                  |
| type     | [ChannelType](../enum/channel-type.md)        | 子频道类型                                  |
| subType  | [ChannelSubType](../enum/channel-sub-type.md) | 子频道子类型                                |
| position | Integer                                       | 排序 (必填，而且不能够和其他子频道的值重复) |
| parentId | String                                        | 分组ID                                      |
| ownerId  | String                                        | 创建人ID                                    |
