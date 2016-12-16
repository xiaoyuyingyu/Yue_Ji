package com.example.yingyu.yue_ji.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.example.yingyu.yue_ji.R;
import com.example.yingyu.yue_ji.ui.base.MVPBaseFragment;
import com.example.yingyu.yue_ji.ui.presenter.GanhuoFgPresenter;
import com.example.yingyu.yue_ji.ui.viewinterface.GanHuoFGViewInterface;

import butterknife.BindView;

public class GanHuoFragment
        extends MVPBaseFragment<GanHuoFGViewInterface, GanhuoFgPresenter>
        implements GanHuoFGViewInterface {

private StaggeredGridLayoutManager layoutManager;

    @BindView(R.id.content_list)
    RecyclerView content_list;

    @Override
    protected GanhuoFgPresenter createPresenter() {
        return new GanhuoFgPresenter(getContext());
    }

    @Override
    protected int createViewLayoutId() {
        return R.layout.fragment_gank;
    }


    @Override
    protected void initView(View rootView) {
        layoutManager=new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        content_list.setLayoutManager(layoutManager);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setDataRefresh(true);
        mPresenter.init();
        mPresenter.getGankData();
    }

    @Override
    public void requestDataRefresh() {
        super.requestDataRefresh();
        mPresenter.getGankData();
    }

    @Override
    public void setDataRefresh(Boolean refresh) {
        setRefresh(refresh);
    }

    @Override
    public StaggeredGridLayoutManager getLayoutManager() {
        return layoutManager;
    }

    @Override
    public RecyclerView getRecyclerView() {
        return content_list;
    }
}
