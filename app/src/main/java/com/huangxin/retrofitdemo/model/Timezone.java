package com.huangxin.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by huangxin on 2018/8/22.
 */

public class Timezone {
    @SerializedName("timezoneId")
    String timeZoneId;

    @Override
    public String toString() {
        return "Timezone{" +
                "timezoneId='" + timeZoneId + '\'' +
                '}';
    }
}
