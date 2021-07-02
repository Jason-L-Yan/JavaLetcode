package com.aoligei.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target = null;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 1. 调用目标方法
        Object res = method.invoke(target, args);
        if (res != null) {
            Integer num = (Integer) res;
            res = num * 2;
        }
        return res;
    }
}
