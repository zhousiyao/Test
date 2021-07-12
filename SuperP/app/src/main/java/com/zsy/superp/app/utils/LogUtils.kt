package com.zsy.superp.app.utils

import android.util.Log

object LogUtils {
    var switch = false
    var target = "APP-LogUtils"

    fun switch(isClose : Boolean){
        switch = isClose
    }

    fun e(msg:String){
        if(!switch) Log.e(target,msg)
    }
    fun e(tar:String,msg:String){
        if(!switch) Log.e(tar,msg)
    }
}