package com.zsy.superp.java.design_mode.proxy;

import com.zsy.superp.java.util.LogUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyAction implements InvocationHandler {

    private Object object;
    public DynamicProxyAction(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //dosomething...
        System.out.println("委托实现类 ----- 前");
        Object result = method.invoke(this.object,args);
        System.out.println("委托实现类 ----- 后");
        //dosomething...
        return result;
    }
}
