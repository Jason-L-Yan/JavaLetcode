package com.aoligei;

import com.aoligei.factory.UsbKingFactory;
import com.aoligei.handler.MySellHandler;
import com.aoligei.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        // 创建代理对象，使用Proxy
        // 1. 创建目标对象
        UsbSell factory = new UsbKingFactory();
        // 2. 创建InvocationHandler对象
        InvocationHandler handler = new MySellHandler(factory);
        // 3. 创建代理对象
        // 因为目标对象，实现了UsbSell接口，所以可以转换成这个接口
        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(), factory.getClass().getInterfaces(), handler);
        // proxy是com.sun.proxy.$Proxy0类的一个对象
        System.out.println(proxy.getClass().getName());
        // 4. 通过代理可以执行方法
        float price = proxy.sell(1);
        System.out.println("通过动态代理对象，调用方法：" + price);

    }
}
