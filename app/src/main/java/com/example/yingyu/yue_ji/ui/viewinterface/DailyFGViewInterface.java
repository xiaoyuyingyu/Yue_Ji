package com.example.yingyu.yue_ji.ui.viewinterface;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public interface DailyFGViewInterface {
    void setDataRefresh(Boolean refresh);
    RecyclerView getRecyclerView();
    LinearLayoutManager getLayoutManager();
}
