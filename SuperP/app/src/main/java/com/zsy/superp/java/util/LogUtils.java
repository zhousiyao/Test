package com.zsy.superp.java.util;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

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
