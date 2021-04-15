package com.zsy.superp.java.design_mode.decorator;

public class SuperA extends DecoratorSuper {
    public SuperA(IDecorator decorator) {
        super(decorator);
    }

    public void decoratorA_1(){
    }
    public void decoratorA_2(){
    }
    public void decoratorA_3(){
    }

    @Override
    public void decorator() {
        super.decorator();
        decoratorA_1();
        decoratorA_2();
        decoratorA_3();
    }
}
