package com.example.qjm3662.jpushtest;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.im.android.api.JMessageClient;

/**
 * Created by qjm3662 on 2016/9/16 0016.
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        JMessageClient.init(this);
    }
}
