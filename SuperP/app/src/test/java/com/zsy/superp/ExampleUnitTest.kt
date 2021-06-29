package com.zsy.superp

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
//        val observables: Observable<String?> =
//            object : Observable<String?>() {
//                override fun subscribeActual(observer: @NonNull Observer<in String?>?) {
//                    observer!!.onNext("1")
//                    observer!!.onNext("2");
//                    println("Observable 当前线程"+ Thread.currentThread().name)
//                }
//            }
//
//        val observers: Observer<String?> =
//            object : Observer<String?> {
//                override fun onSubscribe(d: @NonNull Disposable?) {
//                    println("onSubscribe")
//                }
//
//                override fun onNext(s: @NonNull String?) {
//                    println("onNext = $s")
//                    println("Observer 当前线程"+ Thread.currentThread().name)
//                }
//
//                override fun onError(e: @NonNull Throwable?) {
//                    println("onError")
//                }
//
//                override fun onComplete() {
//                    println("onComplete")
//                }
//            }
//
//        observables
//            .subscribeOn(Schedulers.newThread())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe(observers)
        val str : String? = null
        print("结果 = "+ (str.toString() == "null"))
    }
}