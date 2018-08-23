package com.huangxin.retrofitdemo.network;

import android.content.Context;
import android.os.Build;
import android.util.Log;

import com.google.gson.annotations.SerializedName;
import com.huangxin.retrofitdemo.Constants;
import com.huangxin.retrofitdemo.Utils;
import com.huangxin.retrofitdemo.model.PaperResultBean;
import com.huangxin.retrofitdemo.model.Timezone;
import com.huangxin.retrofitdemo.model.User;
import com.huangxin.retrofitdemo.model.Wallpaper;
import com.huangxin.retrofitdemo.model.Weather;
import com.huangxin.retrofitdemo.model.WeatherInfo;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by huangxin on 2018/8/21.
 */

public class MyHttpClient {

    private static final boolean DBG = false;//true;

    private static final String TAG = MyHttpClient.class.getSimpleName();
    private Retrofit mRetrofit;
    private DemoService mService;
    private AccountService mAccountService;

    private static MyHttpClient sClient;

    private MyHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .build();

       // String url = Constants.GEO_BASE_URL;
       // String url = Constants.PAPER_BASE_URL;
        String url = Constants.WEATHER_BASE_URL;
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient);
        mRetrofit = builder.build();
        mService = mRetrofit.create(DemoService.class);


        Retrofit.Builder builder1 = new Retrofit.Builder()
                .baseUrl("https://test_ACCOUNT_ROOT_URL")  //fake url
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient());
        mAccountService = builder1.build().create(AccountService.class);
    }

    public static MyHttpClient getInstance() {
        if (sClient == null) {
            synchronized (MyHttpClient.class) {
                if (sClient == null) {
                    sClient = new MyHttpClient();
                }
            }
        }

        return sClient;
    }

    public void login(String user, String pwd, String captcha) {
        Call<User> call = mAccountService.login(user, pwd, captcha);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Log.d(TAG, "user:" + response.body() + "  response:" + response);
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }

    public void fetchPapers(Context ctx, Callback<PaperResultBean> callback) {
        Map<String, String> headers =  new HashMap<>();
        headers.put("Device-Id", Utils.getImei(ctx));
        headers.put("device", Build.DEVICE);
        headers.put("color", "white");
        headers.put("version", "1");

        Call<PaperResultBean> call = mService.fetchNewWallpapers(headers);
        call.enqueue(callback);
    }

    public void getTimezone() {
        Call<Timezone> call = mService.getTimezoneId("10", "100");
        call.enqueue(new Callback<Timezone>() {
            @Override
            public void onResponse(Call<Timezone> call, Response<Timezone> response) {
                try {
                    Timezone timezone = response.body();
                    Log.d(TAG, "timezone:" + timezone);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<Timezone> call, Throwable t) {
                Log.d(TAG, "failed:" + t);
            }
        });
    }

    public void getWeather(String cityCode) {
        Call<WeatherInfo> call= mService.getWeather(cityCode);
        call.enqueue(new Callback<WeatherInfo>() {
            @Override
            public void onResponse(Call<WeatherInfo> call, Response<WeatherInfo> response) {
                WeatherInfo body = response.body();
                Log.d(TAG, "success:" + body);
            }

            @Override
            public void onFailure(Call<WeatherInfo> call, Throwable t) {
                Log.d(TAG, "failure:" + t);
            }
        });
    }

}
