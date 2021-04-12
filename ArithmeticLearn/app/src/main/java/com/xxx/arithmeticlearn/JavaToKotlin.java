package com.xxx.arithmeticlearn;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class JavaToKotlin {

    public JavaToKotlin(Context context){

        FrameLayout fl = new FrameLayout(context);
        ViewGroup parent = (ViewGroup)fl.getParent();
        parent.removeView(fl);

        if(null != fl){
            fl.addView(null);
        }
    }
}
