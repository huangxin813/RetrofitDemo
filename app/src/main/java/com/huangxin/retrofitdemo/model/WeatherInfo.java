package com.huangxin.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by huangxin on 2018/8/23.
 */

public class WeatherInfo {
    @SerializedName("weatherinfo")
    Weather weather;

    @Override
    public String toString() {
        return "WeatherInfo{" +
                "weather=" + weather +
                '}';
    }
}
