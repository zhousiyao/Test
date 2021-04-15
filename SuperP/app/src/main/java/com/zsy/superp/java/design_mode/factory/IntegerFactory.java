package com.zsy.superp.java.design_mode.factory;

public class IntegerFactory implements IFactoryMethod {
    @Override
    public Object createObject() {
        return new Integer(0);
    }
}
