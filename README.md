# ROMUpdater

本程序接受一个广播，收到广播后就重启手机进入Recovery模式，并刷入更新包。发送广播代码如下：

```
Intent intent = new Intent("com.luoye.updater.action.ACTION_ROM_UPDATE");
intent.putExtra("package_path","/sdcard/Magisk-v19.4.zip");
intent.setComponent(new ComponentName("com.luoye.updater","com.luoye.updater.UpdateReceiver"));
```

> `package_path`指定一个更新包的路径