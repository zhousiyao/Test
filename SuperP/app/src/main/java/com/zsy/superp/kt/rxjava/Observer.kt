package com.zsy.superp.kt.rxjava

interface Observer<T> {

    fun onSubscribe()

    fun onNext(t:T)

    fun onComplete()

    fun onError(throwable: Throwable)
}