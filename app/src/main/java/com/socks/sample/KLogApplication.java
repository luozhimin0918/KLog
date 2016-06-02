package com.socks.sample;

import android.app.Application;

import com.socks.library.KLog;

/**
 * Created by zhaokaiqiang on 15/11/14.
 */
public class KLogApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        KLog.init(BuildConfig.LOG_DEBUG);//
        // Fields from build type: debug
        //apply plugin: 'com.android.application'    下的build /generated/source/buildConfig/BuildConfig
       // public static final boolean LOG_DEBUG = true;
    }
}
