package com.zsy.superp.java.design_mode.factory;

public class LenovoFactory implements IAbsFactory {
    @Override
    public IPhone createPhone() {
        return new LenovoPhone();
    }

    @Override
    public IComputer createComputer() {
        return new LenovoComputer();
    }
}
