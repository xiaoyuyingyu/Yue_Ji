package com.example.yingyu.yue_ji.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public abstract class MVPBaseActivity<V, T extends BasePresentter<V>> extends AppCompatActivity {

    protected T mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(createPresenter() != null) {
            mPresenter = createPresenter();
            mPresenter.attachView((V) this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mPresenter != null) {
            mPresenter.detachView();
        }
    }

    protected abstract T createPresenter();

}
