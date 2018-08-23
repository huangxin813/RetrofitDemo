package com.huangxin.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by huangxin on 2018/8/23.
 */

public final class PaperResultBean {
    @SerializedName("internal")
    private List<Wallpaper> mInternal;
    @SerializedName("external")
    private List<Wallpaper> mExternal;


    @Override
    public String toString() {
        return "PaperResultBean{" +
                "mInternal=" + mInternal +
                ", mExternal=" + mExternal +
                '}';
    }
}
