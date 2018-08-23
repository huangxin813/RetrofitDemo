package com.huangxin.retrofitdemo;

import android.content.Context;
import android.telephony.TelephonyManager;


public final class Utils {

    public static String getImei(Context context) {
        TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        String imei = tm.getDeviceId();
        return imei == null ? "0" : imei;
    }



}
