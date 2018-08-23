package com.huangxin.retrofitdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.huangxin.retrofitdemo.model.PaperResultBean;
import com.huangxin.retrofitdemo.model.Wallpaper;
import com.huangxin.retrofitdemo.network.MyHttpClient;

import java.io.IOException;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        MyHttpClient.getInstance().fetchPapers(this, new Callback<PaperResultBean>() {
            @Override
            public void onResponse(Call<PaperResultBean> call, Response<PaperResultBean> response) {
                Log.d("", "=======response:" + response);
                try {
                    PaperResultBean body = response.body();
                    Log.d("", "========body:" + body);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<PaperResultBean> call, Throwable t) {
                Log.d("", "======failed:" + t);
            }
        });
        */

      //  MyHttpClient.getInstance().getTimezone();
        MyHttpClient.getInstance().getWeather("101010100");
    }
}
