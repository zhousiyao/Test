package com.zsy.superp.kt.util

import android.util.Log

object LogUtils {

    var switch = false
    var target = "LogUtils"

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