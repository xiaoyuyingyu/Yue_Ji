package com.example.yingyu.yue_ji.ui.base;


import com.example.yingyu.yue_ji.api.ApiFactory;
import com.example.yingyu.yue_ji.api.DailyApi;
import com.example.yingyu.yue_ji.api.GankApi;
import com.example.yingyu.yue_ji.api.ZhihuApi;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;


public abstract class BasePresentter<T> {

    protected Reference<T> mViewRef;//view接口类型的弱引用

    public static final ZhihuApi zhihuApi = ApiFactory.getZhihuApiSingleton();
    public static final GankApi gankApi = ApiFactory.getGankApiSingleton();
    public static final DailyApi dailyApi = ApiFactory.getDailyApiSingleton();

    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);//建立关联
    }

    protected T getView() {
        return mViewRef.get();
    }

    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
