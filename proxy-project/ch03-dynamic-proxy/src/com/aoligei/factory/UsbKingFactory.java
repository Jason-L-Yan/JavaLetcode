package com.aoligei.factory;

import com.aoligei.service.UsbSell;

// 目标类
public class UsbKingFactory implements UsbSell {

    public UsbKingFactory() {
        System.out.println("构造器运行了");
    }

    @Override
    public float sell(int amount) {
        // 目标方法
        System.out.println("目标类中，执行sell目标方法");
        return 85.0f;
    }
}
