package com.example.yingyu.yue_ji.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.yingyu.yue_ji.R;
import com.example.yingyu.yue_ji.ui.base.MVPBaseFragment;
import com.example.yingyu.yue_ji.ui.presenter.ZhihuFgPresenter;
import com.example.yingyu.yue_ji.ui.viewinterface.ZhiHuFGViewInterface;

import butterknife.BindView;

public class ZhiHuRiBaoFragment
        extends MVPBaseFragment<ZhiHuFGViewInterface,ZhihuFgPresenter>
        implements ZhiHuFGViewInterface {

    private final static String TAG = "ZhiHuRiBaoFragment";

    private LinearLayoutManager mLayoutManager;

    //正在刷新
    private boolean mIsRequestDataRefresh = false;

    @BindView(R.id.content_recycler_view)
    RecyclerView content_recycler_view;

    @Override
    protected void initView(View rootView) {
        mLayoutManager = new LinearLayoutManager(getContext());
        content_recycler_view.setLayoutManager(mLayoutManager);
    }

    @Override
    protected ZhihuFgPresenter createPresenter() {
        return new ZhihuFgPresenter(getContext());
    }

    @Override
    protected int createViewLayoutId() {
        return R.layout.fragment_zhihuribao;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setDataRefresh(true);
        mPresenter.init();
        mPresenter.getLatestNews();
    }

    //用户下拉刷新回调
    @Override
    public void requestDataRefresh() {
        super.requestDataRefresh();
        mPresenter.getLatestNews();
    }

    //刷新，或者关闭刷新
    @Override
    public void setDataRefresh(Boolean refresh) {
        setRefresh(refresh);
    }

    @Override
    public RecyclerView getRecyclerView() {
        return content_recycler_view;
    }

    @Override
    public LinearLayoutManager getLayoutManager() {
        return mLayoutManager;
    }
}
