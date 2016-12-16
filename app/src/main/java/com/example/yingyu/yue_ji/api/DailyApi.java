package com.example.yingyu.yue_ji.api;


import com.example.yingyu.yue_ji.bean.daily.DailyBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface DailyApi {

    //http://app3.qdaily.com/app3/

    //http://app3.qdaily.com/app3/homes/index/0.json

    @GET("homes/index/{num}.json")
    Observable<DailyBean> getDailyTimeLine(@Path("num") String num);
}
