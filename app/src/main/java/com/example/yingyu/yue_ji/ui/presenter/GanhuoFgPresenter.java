package com.example.yingyu.yue_ji.ui.presenter;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Toast;

import com.example.yingyu.yue_ji.R;
import com.example.yingyu.yue_ji.bean.ganhuo.MeiZi;
import com.example.yingyu.yue_ji.bean.ganhuo.Video;
import com.example.yingyu.yue_ji.ui.adapter.GanhuoListAdapter;
import com.example.yingyu.yue_ji.ui.base.BasePresentter;
import com.example.yingyu.yue_ji.ui.viewinterface.GanHuoFGViewInterface;

import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

public class GanhuoFgPresenter extends BasePresentter<GanHuoFGViewInterface> {


    private Context mContext;
    private GanHuoFGViewInterface ganhuoFgView;
    private RecyclerView mRecyclerView;
    private StaggeredGridLayoutManager layoutManager;
    List<MeiZi.Results> list;
    private GanhuoListAdapter adapter;
    private static final int PRELOAD_SIZE = 6;
    private int[] lastPositions;

    /**
     * 最后一个可显示的item的position
     */
    private int lastVisibleItemPosition;
    /**
     * 是否加载过更多
     */
    private boolean isLoadMore = false;
    private int page = 1;

    public GanhuoFgPresenter(Context context) {
        mContext = context;
    }

    public void init() {
        ganhuoFgView = getView();
//        new Once(mContext).show("tip_guide_6", new Once.OnceCallback() {
//            @Override
//            public void onOnce() {
//                Snackbar.make(mRecyclerView,R.string.tip_guide,Snackbar.LENGTH_INDEFINITE)
//                        .setAction(R.string.i_know, new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//
//                            }
//                        }).show();
//            }
//        });
        if(ganhuoFgView == null) return;
        mRecyclerView = ganhuoFgView.getRecyclerView();
        layoutManager = ganhuoFgView.getLayoutManager();
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                if (lastPositions == null) {
                    lastPositions = new int[layoutManager.getSpanCount()];
                }
                layoutManager.findLastVisibleItemPositions(lastPositions);
                lastVisibleItemPosition = findMax(lastPositions);
                int totalItemCount = layoutManager.getItemCount();
                if(newState == RecyclerView.SCROLL_STATE_IDLE&& (lastVisibleItemPosition) >= totalItemCount - 1) {
                        ganhuoFgView.setDataRefresh(true);
                        isLoadMore = true;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                getGankData();
                            }
                        }, 1000);
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            }
        });
    }

    private int findMax(int[] lastPositions) {
        int max = lastPositions[0];
        for (int value : lastPositions) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    public void getGankData() {
        if(ganhuoFgView != null) {

            if(isLoadMore){
                page = page + 1;
            }

            //请求两次，将两次的结果进行处理，返回一个新的结果，Rxjava组合操作符
            Observable.zip(
                    gankApi.getMeiziData(page),
                    gankApi.getVideoData(page),
                    new Func2<MeiZi, Video, MeiZi>() {
                        @Override
                        public MeiZi call(MeiZi meiZi, Video video) {
                            List<MeiZi.Results> results = meiZi.getResults();
                            for (MeiZi.Results gankmeizhi : results) {
                                int position = results.indexOf(gankmeizhi);
                                gankmeizhi.setDesc(gankmeizhi.getDesc() + " " +
                                        video.getResults().get(position).getDesc());
                                gankmeizhi.setContentUrl(video.getResults().get(position).getUrl());
                            }
                            return meiZi;
                        }
                    })
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Action1<MeiZi>() {
                        @Override
                        public void call(MeiZi meiZi) {
                            displayMeizi(mContext, meiZi.getResults(), ganhuoFgView, mRecyclerView);
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

    private void displayMeizi(Context mContext, List<MeiZi.Results> results,
                              GanHuoFGViewInterface ganhuoFgView, RecyclerView mRecyclerView) {
        if(isLoadMore) {
            if(results == null) {
                //关闭刷新
                ganhuoFgView.setDataRefresh(false);
            } else {
                list.addAll(results);
            }
        } else {
            list = results;

            adapter = new GanhuoListAdapter(mContext, list);

            mRecyclerView.setAdapter(adapter);
        }
        adapter.notifyDataSetChanged();
        ganhuoFgView.setDataRefresh(false);
    }

    public void reView() {
        adapter.notifyDataSetChanged();
    }

}
