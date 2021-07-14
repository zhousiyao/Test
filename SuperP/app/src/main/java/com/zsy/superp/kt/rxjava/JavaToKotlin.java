package com.zsy.superp.kt.rxjava;

import org.jetbrains.annotations.NotNull;

public class JavaToKotlin<T> extends Observable<T> {


    @Override
    public void subscribeAbstract(@NotNull Observer<T> observer) {

    }

    static class CreateEmitter<T> implements Emitter<T>{

        @Override
        public void onNext(T t) {

        }

        @Override
        public void onComplete() {

        }

        @Override
        public void onError(@NotNull Throwable throwable) {

        }
    }

}
