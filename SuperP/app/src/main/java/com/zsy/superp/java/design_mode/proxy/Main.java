package com.zsy.superp.java.design_mode.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    @Test
    public void aaa() {

       IDelegation delegation = new DelegationImpl();
       InvocationHandler delegationInvokeHandler = new DynamicProxyAction(delegation);
       IDelegation delegationProxy = (IDelegation) Proxy.newProxyInstance(delegation.getClass().getClassLoader(),delegation.getClass().getInterfaces(),delegationInvokeHandler);
       delegationProxy.getName();


    }
}
