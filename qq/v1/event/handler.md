---
title: 事件监听器
author: WhkSoft
date: 2021-12-31
---

## 基础
为了让你的bot能够监听并处理该事件的回调，你需要为它创建一个实现`EventHandler`的类，并在此类中进行方法重写。
```java
public class MyEventHandler extends EventHandler {
    //一些要重写的方法
}
```

你可以在此类中重写特定的方法，这里以收到艾特消息为例：
```java
public class MyEventHandler extends EventHandler {
    @Override
    protected void onAtMessage(AtMessageEvent event) {
        //你自己的代码
    }
}
```

为了让SDK能使用此监听器，你需要设置你的监听器实例
```java
MyEventHandler handler = new IEventHandler();
// handler.setRemoveAt(false); // 取消删除消息中的艾特
bot.setEventHandler(handler);
```


