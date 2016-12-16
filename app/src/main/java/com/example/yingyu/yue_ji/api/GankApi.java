package com.example.yingyu.yue_ji.api;


import com.example.yingyu.yue_ji.bean.ganhuo.MeiZi;
import com.example.yingyu.yue_ji.bean.ganhuo.Video;


import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;



public interface GankApi {
    //http://gank.io/api/

    //http://gank.io/api/data/福利/10/1
    @GET("data/福利/10/{page}")
    Observable<MeiZi> getMeiziData(@Path("page") int page);

    //http://gank.io/api/data/休息视频/10/1
    @GET("data/休息视频/10/{page}")
    Observable<Video> getVideoData(@Path("page") int page);

}
