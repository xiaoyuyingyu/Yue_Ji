package com.example.yingyu.yue_ji.ui.activity;

import android.os.Bundle;

import com.example.yingyu.yue_ji.R;
import com.example.yingyu.yue_ji.ui.base.BasePresentter;
import com.example.yingyu.yue_ji.ui.base.MVPBaseActivity;

import butterknife.ButterKnife;


public class AboutMeActivity extends MVPBaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        ButterKnife.bind(this);
    }

    @Override
    protected BasePresentter createPresenter() {
        return null;
    }


}
