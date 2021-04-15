package com.zsy.superp.java.design_mode.factory;

import org.junit.Test;

public class Main {

    @Test
    public void main(){
        //工厂方法
        IFactoryMethod factoryMethod = new IntegerFactory();
        factoryMethod.createObject();
        factoryMethod = new StringFactory();
        factoryMethod.createObject();

    }
}
