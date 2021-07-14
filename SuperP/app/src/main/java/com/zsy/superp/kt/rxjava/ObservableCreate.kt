package com.zsy.superp.kt.rxjava

class ObservableCreate<T>(val source : ObservableOnSubscribe<T>) : Observable<T>() {

    override fun subscribeAbstract(observer: Observer<T>) {
        observer.onSubscribe()

        var emitter = CreateEmitter(observer)
        source.subscribe(emitter)
    }

    internal class CreateEmitter<T>(val observer: Observer<T>) : Emitter<T>{

        var done:Boolean = false

        override fun onNext(t: T) {
            if(done) return
            observer.onNext(t)
        }

        override fun onComplete() {
            if(done) return
            observer.onComplete()
            done = true
        }

        override fun onError(throwable: Throwable) {
            if(done) return
            observer.onError(throwable)
            done = true
        }

    }
}