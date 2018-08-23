package com.huangxin.retrofitdemo.model;

/**
 * Created by huangxin on 2018/8/21.
 */

public class User {

    private String mUserName;

    private String mPassword;


    @Override
    public String toString() {
        return "User{" +
                "mUserName='" + mUserName + '\'' +
                ", mPassword='" + mPassword + '\'' +
                '}';
    }
}
