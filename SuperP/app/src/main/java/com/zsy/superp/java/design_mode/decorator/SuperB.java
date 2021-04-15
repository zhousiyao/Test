package com.zsy.superp.java.design_mode.decorator;

public class SuperB extends DecoratorSuper {
    public SuperB(IDecorator decorator) {
        super(decorator);
    }

    public void decoratorB_1(){
    }
    public void decoratorB_2(){
    }
    public void decoratorB_3(){
    }

    @Override
    public void decorator() {
        super.decorator();
        decoratorB_1();
        decoratorB_2();
        decoratorB_3();
    }
}
