package com.zsy.superp.kt.rxjava

/**
 * 被观察者与Emitter建立关系
 */
interface ObservableOnSubscribe<T> {


    fun subscribe(emitter: Emitter<T>)
}