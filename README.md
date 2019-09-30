# ROMUpdater

本程序的`UpdaterActivity`被启动就重启手机进入Recovery模式，并刷入更新包。启动`UpdaterActivity`代码如下：

```
Intent intent = new Intent("com.luoye.updater.action.ACTION_ROM_UPDATE");
intent.putExtra("package_path","/sdcard/Magisk-v19.4.zip");
intent.setComponent(new ComponentName("com.luoye.updater","com.luoye.updater.UpdaterActivity"));
startActivity(intent);
```

> `package_path`指定一个更新包的路径