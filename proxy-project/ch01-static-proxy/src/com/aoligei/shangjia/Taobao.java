package com.aoligei.shangjia;

import com.aoligei.factory.UsbKingFactory;
import com.aoligei.service.UsbSell;

// TaoBao是一个商家，代理金士顿u盘销售
public class Taobao implements UsbSell {

    // 商家代理的厂家是谁。
    private UsbSell factory = new UsbKingFactory();

    @Override
    public float sell(int amount) {

        // 向厂家发送订单，告诉厂家，我买了u盘，厂家发货
        float price = factory.sell(amount);  // 厂家价格
        // 商家加价，也就是代理要增加的价格
        price += 25;  // 增强功能，代理类在完成目标类方法调用后，增强了功能

        return price;
    }
}
