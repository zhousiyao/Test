package com.zsy.superp.kt.test

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import com.zsy.superp.kt.util.LogUtils

class TestService : Service() {

    val aaa : String by lazy { "123" }

    override fun onBind(intent: Intent?): IBinder? {
        LogUtils.e("TestService onBind")
        return MyBinder()
    }

    override fun onCreate() {
        super.onCreate()
        LogUtils.e("TestService onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        LogUtils.e("TestService onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    internal inner class MyBinder : Binder() {//注意实现接口的方式
    }
}
