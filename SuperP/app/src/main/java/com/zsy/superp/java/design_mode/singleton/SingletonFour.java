package com.zsy.superp.java.design_mode.singleton;

public class SingletonFour {

    private SingletonFour(){}
    static SingletonFour getInstance(){
        return SingletonFourInternal.instance;
    }
    static class SingletonFourInternal{
        private static SingletonFour instance = new SingletonFour();
    }
}
