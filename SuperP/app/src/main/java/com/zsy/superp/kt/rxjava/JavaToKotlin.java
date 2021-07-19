package com.zsy.superp.kt.rxjava;

import org.jetbrains.annotations.NotNull;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;

public class JavaToKotlin {


//    @Override
//    public void subscribeAbstract(@NotNull Observer<T> observer) {
//
//    }
//
//    static class CreateEmitter<T> implements Emitter<T>{
//
//        @Override
//        public void onNext(T t) {
//
//        }
//
//        @Override
//        public void onComplete() {
//
//        }
//
//        @Override
//        public void onError(@NotNull Throwable throwable) {
//
//        }
//    }

    public void test(){
        Observable.create(new ObservableOnSubscribe(){

            @Override
            public void subscribe(@NonNull ObservableEmitter emitter) throws Throwable {

            }
        });
    }

}
