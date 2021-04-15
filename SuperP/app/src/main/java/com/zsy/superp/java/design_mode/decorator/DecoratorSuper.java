package com.zsy.superp.java.design_mode.decorator;

public abstract class DecoratorSuper implements IDecorator {

    private IDecorator decorator;

    public DecoratorSuper(IDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public void decorator() {
        decorator.decorator();
    }
}
