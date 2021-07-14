package com.zsy.superp.kt.rxjava

/**
 * 被观察者的顶层类
 */
interface ObservableSource<T> {
    //被观察者与观察者建立关联（类似addObserver）
    fun subscribe(observer: Observer<T>)
}