package com.example.yingyu.yue_ji.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.yingyu.yue_ji.R;
import com.example.yingyu.yue_ji.ui.base.MVPBaseFragment;
import com.example.yingyu.yue_ji.ui.presenter.DailyFgPresenter;
import com.example.yingyu.yue_ji.ui.viewinterface.DailyFGViewInterface;

import butterknife.BindView;

;
public class DailyFragment
        extends MVPBaseFragment<DailyFGViewInterface, DailyFgPresenter>
        implements DailyFGViewInterface {

    private LinearLayoutManager mLayoutManager;

    @BindView(R.id.content_list)
    RecyclerView content_list;

    @Override
    protected DailyFgPresenter createPresenter() {
        return new DailyFgPresenter(getContext());
    }

    @Override
    protected int createViewLayoutId() {
        return R.layout.fragment_daily;
    }

    @Override
    protected void initView(View rootView) {
        mLayoutManager = new LinearLayoutManager(getContext());
        content_list.setLayoutManager(mLayoutManager);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setDataRefresh(true);
        mPresenter.getDailyTimeLine("0");
    }

    @Override
    public void requestDataRefresh() {
        super.requestDataRefresh();
        mPresenter.getDailyTimeLine("0");
    }

//    @Override
//    protected void rePaintView() {
//        mPresenter.reView();
//    }

    //3个接口方法
    @Override
    public void setDataRefresh(Boolean refresh) {
        setRefresh(refresh);
    }

    @Override
    public RecyclerView getRecyclerView() {
        return content_list;
    }

    @Override
    public LinearLayoutManager getLayoutManager() {
        return mLayoutManager;
    }
}
