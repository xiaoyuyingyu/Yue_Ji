package com.example.yingyu.yue_ji.ui.viewinterface;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;


public interface GanHuoFGViewInterface {
    void setDataRefresh(Boolean refresh);
//    GridLayoutManager getLayoutManager();
    RecyclerView getRecyclerView();
    StaggeredGridLayoutManager getLayoutManager();
}
