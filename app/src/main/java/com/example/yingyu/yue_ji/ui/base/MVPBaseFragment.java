package com.example.yingyu.yue_ji.ui.base;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yingyu.yue_ji.R;

import butterknife.ButterKnife;

public abstract class MVPBaseFragment<V, T extends BasePresentter<V>> extends Fragment {

    protected T mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (createPresenter() != null) {
            mPresenter = createPresenter();
            mPresenter.attachView((V) this);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(createViewLayoutId(), container, false);
        ButterKnife.bind(this, rootView);
        initView(rootView);
        if (isSetRefresh()) {
            setUpSwipeRefresh(rootView);
        }
        return rootView;
    }



    /**
     * 是否正在刷新
     */
    private boolean mIsRequestDataRefresh = false;
    private SwipeRefreshLayout mRefreshLayout;

    private void setUpSwipeRefresh(View rootView) {
        mRefreshLayout = (SwipeRefreshLayout) rootView.findViewById(R.id.swipe_refresh);
        if (mRefreshLayout != null) {
            mRefreshLayout.setColorSchemeResources(
                    R.color.refresh_progress_1,
                    R.color.refresh_progress_2,
                    R.color.refresh_progress_3
            );
            mRefreshLayout.setProgressViewOffset(false, 0, (int) TypedValue
                    .applyDimension(TypedValue.COMPLEX_UNIT_DIP, 24, getResources()
                            .getDisplayMetrics()));
            mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                @Override
                public void onRefresh() {
                    //请求刷新，父类重写此方法，这里调用复用的方法刷新
                    requestDataRefresh();
                }
            });
        }
    }

    public void requestDataRefresh() {
        mIsRequestDataRefresh = true;
    }

    public void setRefresh(boolean requestDataRefresh) {
        if (mRefreshLayout == null) {
            return;
        }
        if (!requestDataRefresh) { //请求关闭刷新
            mIsRequestDataRefresh = false;
            //一秒后关闭
            mRefreshLayout.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //刷新完成
                    mRefreshLayout.setRefreshing(false);
                }
            }, 1000);
        } else {
            //正在刷新
            mRefreshLayout.setRefreshing(true);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    protected abstract void initView(View rootView);

    protected abstract T createPresenter();

    protected abstract int createViewLayoutId();

    //默认有下拉刷新
    public Boolean isSetRefresh() {
        return true;
    }
}
