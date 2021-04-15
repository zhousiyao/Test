package com.zsy.superp.java.design_mode.factory;

public class XiaomiFactory implements IAbsFactory {
    @Override
    public IPhone createPhone() {
        return new XiaomiPhone();
    }

    @Override
    public IComputer createComputer() {
        return new XiaomiComputer();
    }
}
