package com.example.yingyu.yue_ji.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.yingyu.yue_ji.R;
import com.example.yingyu.yue_ji.ui.base.MVPBaseFragment;
import com.example.yingyu.yue_ji.widget.MyApp;

import java.util.List;

public class ViewPagerFragmentAdapter extends FragmentPagerAdapter {


    private List<MVPBaseFragment> fragmentList;

    public ViewPagerFragmentAdapter(FragmentManager fm, List<MVPBaseFragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return MyApp.mContext.getString(R.string.page1);
            case 1:
                return MyApp.mContext.getString(R.string.page2);
            case 2:
                return MyApp.mContext.getString(R.string.page3);
        }
        return null;
    }
}
