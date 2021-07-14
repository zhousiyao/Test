package com.zsy.superp.app.ui.main.lifecycle

import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.zsy.superp.app.net.BaseApi
import com.zsy.superp.app.utils.LogUtils
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

class MainLifeCycle : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateMain(){

        LogUtils.e("开始请求...")
//        BaseApi.apiDomain.getHomeInfo()


//        val ob1= Observable.create<String> {
//            it.onNext("")
//        }

        Observable.just("123","abc")
            .subscribe(object : Observer<String> {
                override fun onComplete() {
                    LogUtils.e("onComplete")
                }

                override fun onSubscribe(d: Disposable?) {
                    LogUtils.e("onSubscribe === $d")
                }

                override fun onNext(t: String?) {
                    LogUtils.e("onNext === $t")
                }

                override fun onError(e: Throwable?) {
                    LogUtils.e("onError === ${e.toString()}")
                }

            })
    }

}