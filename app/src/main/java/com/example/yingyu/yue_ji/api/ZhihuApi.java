package com.example.yingyu.yue_ji.api;

import com.example.yingyu.yue_ji.bean.zhihu.LatestNews;
import com.example.yingyu.yue_ji.bean.zhihu.NewDetail;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;


public interface ZhihuApi {

    //http://news-at.zhihu.com/api/4/

    //http://news-at.zhihu.com/api/4/news/latest
    @GET("news/latest")
    Observable<LatestNews> getLatestNews();

    //http://news-at.zhihu.com/api/4/news/8811992
    @GET("news/{id}")
    Observable<NewDetail> getDetailNews(@Path("id") String id);

    //http://news-at.zhihu.com/api/4/news/before/20160921
    @GET("news/before/{time}")
    Observable<LatestNews> getBeforeNews(@Path("time") String time);
}
