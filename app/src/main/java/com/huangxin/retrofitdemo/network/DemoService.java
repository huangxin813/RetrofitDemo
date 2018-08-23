package com.huangxin.retrofitdemo.network;

import com.huangxin.retrofitdemo.model.PaperResultBean;
import com.huangxin.retrofitdemo.model.Timezone;
import com.huangxin.retrofitdemo.model.User;
import com.huangxin.retrofitdemo.model.Wallpaper;
import com.huangxin.retrofitdemo.model.Weather;
import com.huangxin.retrofitdemo.model.WeatherInfo;

import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface DemoService {


    @GET("paper/newpapers")
    Call<PaperResultBean> fetchNewWallpapers(@HeaderMap Map<String, String> headers);

    @GET("timezone")
    Call<Timezone> getTimezoneId(@Query("lat") String lat, @Query("lng") String lng);

    @GET("data/cityinfo/{citycode}.html")
    Call<WeatherInfo> getWeather(@Path("citycode") String city);
}
