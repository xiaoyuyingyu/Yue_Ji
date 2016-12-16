package com.example.yingyu.yue_ji.util;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by drakeet on 8/16/15.
 */
public class Once {

    SharedPreferences mSharedPreferences;
    Context mmContext;


    public Once(Context context) {
        mSharedPreferences = context.getSharedPreferences("once", Context.MODE_PRIVATE);
        mmContext = context;
    }


    public void show(String tagKey, OnceCallback callback) {
        boolean isSecondTime = mSharedPreferences.getBoolean(tagKey, false);
        if (!isSecondTime) {
            callback.onOnce();
            SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putBoolean(tagKey, true);
            editor.apply();
        }
    }


//    public void show(int tagKeyResId, OnceCallback callback) {
//        show(mContext.getString(tagKeyResId), callback);
//    }


    public interface OnceCallback {
        void onOnce();
    }
}
