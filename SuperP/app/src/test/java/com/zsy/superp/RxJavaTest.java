package com.zsy.superp;

import org.junit.Test;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;


public class RxJavaTest {

    @Test
    public void startTest(){
        Observable<String> observables = new Observable<String>() {
            @Override
            protected void subscribeActual(@NonNull Observer<? super String> observer) {
                observer.onNext("123");
                observer.onNext("321");
                System.out.println("observables Thread = " + Thread.currentThread().getName());
            }
        };

        Observer observers = new Observer() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull Object o) {
                System.out.println("observers Thread = " + Thread.currentThread().getName());
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
        observables
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull String s) {
                        System.out.println("observers2 Thread = " + Thread.currentThread().getName());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
