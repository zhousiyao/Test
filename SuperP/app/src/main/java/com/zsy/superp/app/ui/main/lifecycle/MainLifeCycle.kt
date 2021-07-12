package com.zsy.superp.app.ui.main.lifecycle

import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.zsy.superp.app.net.BaseApi
import com.zsy.superp.app.utils.LogUtils

class MainLifeCycle : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateMain(savedInstanceState: Bundle?){

        LogUtils.e("开始请求...")
        BaseApi.apiDomain.getHomeInfo()

    }

}