package com.example.yingyu.yue_ji.widget;

import android.app.Application;
import android.content.Context;


public class MyApp extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}
