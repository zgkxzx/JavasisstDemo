package com.zgkxzx.javasisstdemo;

import android.util.Log;

/**
 * @author: zhaoxiang
 * @create: 2018/6/3 23:50
 * @description: 埋点检测器，这里只是做日志打印
 */
public class Monitor {

    public final static String TAG = Monitor.class.getSimpleName();


    public static void drop(Object obj1, Object obj2, Object obj3) {
        if (obj1 != null) {
            Log.e(TAG, obj1+" --> "+obj2+" --> "+obj3);
        }

    }


}
