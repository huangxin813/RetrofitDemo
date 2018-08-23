package com.huangxin.retrofitdemo.network;

import com.huangxin.retrofitdemo.model.User;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by huangxin on 2018/8/22.
 */

public interface AccountService {

    @POST
    Call<User> login(String user, String pwd, String captcha);


}
