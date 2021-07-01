package com.zsy.superp.kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.zsy.superp.R
import com.zsy.superp.kt.util.LogUtils
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.coroutines.*
import kotlin.time.days

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(MainLifecycle())

        coroutineLearn()


    }

    private fun coroutineLearn() {
        LogUtils.e("current thread ${Thread.currentThread().name}")

//        coroutineTest()
//        GlobalScope.launch() {
//            delay(6000)
//
//            LogUtils.e("coroutine end coroutine thread ${Thread.currentThread().name}")
//        }

        GlobalScope.launch(Dispatchers.Main){
            suspandMethodTest()
        }

        LogUtils.e("coroutine end")
    }

    private suspend fun suspandMethodTest(){

        LogUtils.e("suspandMethod start")
        withContext(Dispatchers.IO){
            delay(3000)
        }
        LogUtils.e("suspandMethod end")
    }


    private fun coroutineTest() = runBlocking {
        LogUtils.e("coroutine thread ${Thread.currentThread().name}")
        repeat(8){
            LogUtils.e("repeat process ${it}")
            delay(5000)
        }
    }

    fun rxJava(){
        val observables: Observable<String?> =
            object : Observable<String?>() {
                override fun subscribeActual(observer: @NonNull Observer<in String?>?) {
                    observer!!.onNext("1")
                    observer!!.onNext("2");
                    LogUtils.e("Observable 当前线程"+ Thread.currentThread().name)
                }
            }

        val observers: Observer<String?> =
            object : Observer<String?> {
                override fun onSubscribe(d: @NonNull Disposable?) {
                    LogUtils.e("onSubscribe")
                }

                override fun onNext(s: @NonNull String?) {
                    LogUtils.e("onNext = $s")
                    LogUtils.e("Observer 当前线程"+ Thread.currentThread().name)
                }

                override fun onError(e: @NonNull Throwable?) {
                    LogUtils.e("onError")
                }

                override fun onComplete() {
                    LogUtils.e("onComplete")
                }
            }


        observables
            .subscribeOn(Schedulers.newThread())
            .observeOn(Schedulers.newThread())
            .subscribe(observers)
    }

    class MainLifecycle : LifecycleObserver{
        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        fun onStartForLifecycle(){
            LogUtils.e("Start")
        }
        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        fun onResumeForLifecycle(){
            LogUtils.e("Resume")
        }
        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        fun onCreateForLifecycle(){
            LogUtils.e("onCreate")
        }
    }

    fun toListAndRecycle(view: View) {

    }

    fun toInvalidateAndRequestLayout(view: View) {}
}