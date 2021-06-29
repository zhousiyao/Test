package com.zsy.superp.java.util;

import android.util.Log;

public class LogUtils {

    private static String Tag = "Java-LogUtils";
    private static boolean mIsPrint = true;

    public static void setIsPrint(boolean isPrint){
        mIsPrint = isPrint;
    }

    public static void e(String msg){
        if(mIsPrint) Log.e(Tag,msg);
    }
    public static void e(String tag,String msg){
        if(mIsPrint) Log.e(tag,msg);
    }
}
