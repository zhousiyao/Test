package com.zsy.superp.kt.rxjava

/**
 * 被观察者核心抽象类
 */
abstract class Observable<T> : ObservableSource<T> {
    override fun subscribe(observer: Observer<T>) {

        //与observer建立订阅关系
        subscribeAbstract(observer)
    }

    abstract fun subscribeAbstract(observer: Observer<T>)

    companion object{

    }
}