package com.zsy.superp.app.ui.main.lifecycle

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.zsy.superp.app.utils.LogUtils
import com.zsy.superp.kt.rxjava.Emitter
import com.zsy.superp.kt.rxjava.Observable
import com.zsy.superp.kt.rxjava.ObservableOnSubscribe
import com.zsy.superp.kt.rxjava.Observer
import io.reactivex.rxjava3.subjects.AsyncSubject
import io.reactivex.rxjava3.subjects.BehaviorSubject
import io.reactivex.rxjava3.subjects.ReplaySubject

class MainLifeCycle : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateMain(){

        LogUtils.e("开始请求...")
//        BaseApi.apiDomain.getHomeInfo()


//        val ob1= Observable.create<String> {
//            it.onNext("")
//        }

        io.reactivex.rxjava3.core.Observable.create<String> {
            it.onNext("123")
        }

        Observable.create(object :ObservableOnSubscribe<String>{
            override fun subscribe(emitter: Emitter<String>) {
//                emitter.onNext("123")
//                emitter.onNext("333")
            }
        }).subscribe(object : Observer<String>{
            override fun onSubscribe() {
                LogUtils.e(" onSubscribe()===")
            }

            override fun onNext(t: String) {
                LogUtils.e(" onNext()=== $t")
            }

            override fun onComplete() {
                LogUtils.e(" onComplete()===")
            }

            override fun onError(throwable: Throwable) {
                LogUtils.e(" onError()===")
            }

        })

        val subject = AsyncSubject.create<String>()
        subject.onNext("AAA")
        subject.onNext("BBB")
        subject.subscribe{ str ->
                LogUtils.e("接受到事件 = $str" )
            }
//        subject.onNext("XXX")
//        subject.onNext("ZZZ")
        subject.onComplete()
    }

}