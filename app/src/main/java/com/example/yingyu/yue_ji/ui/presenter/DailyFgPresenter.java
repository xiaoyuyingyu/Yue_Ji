package com.example.yingyu.yue_ji.ui.presenter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.yingyu.yue_ji.R;
import com.example.yingyu.yue_ji.bean.daily.DailyBean;
import com.example.yingyu.yue_ji.ui.adapter.DailyListAdapter;
import com.example.yingyu.yue_ji.ui.base.BasePresentter;
import com.example.yingyu.yue_ji.ui.viewinterface.DailyFGViewInterface;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;


public class DailyFgPresenter extends BasePresentter<DailyFGViewInterface> {

    private Context mContext;
    private DailyFGViewInterface dailyFgView;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager layoutManager;

    public DailyFgPresenter(Context mContext) {
        this.mContext = mContext;
    }

    public void getDailyTimeLine(String num) {
        dailyFgView = getView();
        if(dailyFgView != null) {
            mRecyclerView = dailyFgView.getRecyclerView();
            layoutManager = dailyFgView.getLayoutManager();
            dailyApi.getDailyTimeLine(num)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Action1<DailyBean>() {
                        @Override
                        public void call(DailyBean dailyBean) {
                            displayDaily(mContext, dailyBean, mRecyclerView, dailyFgView);
                        }
                    }, new Action1<Throwable>() {
                        @Override
                        public void call(Throwable throwable) {
                            throwable.printStackTrace();
                            Toast.makeText(mContext, R.string.net_wrong, Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }

    private DailyBean mDailyBean;
    private DailyListAdapter adapter;
    private void displayDaily(Context mContext, DailyBean dailyBean,
                              RecyclerView mRecyclerView, DailyFGViewInterface dailyFgView) {
        //加载更多，稍后完善
        if(false) {

        } else {
            mDailyBean = dailyBean;
            adapter = new DailyListAdapter(mContext, dailyBean.getResponse());
            mRecyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();
        }
        dailyFgView.setDataRefresh(false);
    }

    public void reView() {
        adapter.notifyDataSetChanged();
    }

}
