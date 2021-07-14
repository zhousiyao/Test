package com.zsy.superp.kt.rxjava

interface Emitter<T> {

    fun onNext(t:T)

    fun onComplete()

    fun onError(throwable: Throwable)
}