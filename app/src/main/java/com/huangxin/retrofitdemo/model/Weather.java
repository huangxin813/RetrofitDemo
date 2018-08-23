package com.huangxin.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;


public class Weather {

    @SerializedName("city")
    private String mCity;

    @SerializedName("cityid")
    private String mCityId;

    @SerializedName("temp1")
    private String mLowTemp;

    @SerializedName("temp2")
    private String mHighTemp;

    @SerializedName("weather")
    private String mWeather;

    @SerializedName("img1")
    private String mImg1;

    @SerializedName("img2")
    private String mImg2;

    @SerializedName("ptime")
    private String mTime;

    @Override
    public String toString() {
        return "Weather{" +
                "mCity='" + mCity + '\'' +
                ", mCityId='" + mCityId + '\'' +
                ", mLowTemp='" + mLowTemp + '\'' +
                ", mHighTemp='" + mHighTemp + '\'' +
                ", mWeather='" + mWeather + '\'' +
                ", mImg1='" + mImg1 + '\'' +
                ", mImg2='" + mImg2 + '\'' +
                ", mTime='" + mTime + '\'' +
                '}';
    }
}
