package com.zsy.superp.java.design_mode.proxy;

import com.zsy.superp.java.util.LogUtils;

public class DelegationImpl implements IDelegation {
    @Override
    public String getName() {
        System.out.println("委托实现类");
        return "委托实现类";
    }
}
