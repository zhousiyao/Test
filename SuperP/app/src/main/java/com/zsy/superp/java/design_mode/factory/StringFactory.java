package com.zsy.superp.java.design_mode.factory;

public class StringFactory implements IFactoryMethod {
    @Override
    public Object createObject() {
        return new String("String Object");
    }
}
