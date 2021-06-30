package com.aoligei.factory;

import com.aoligei.service.UsbSell;

public class UsbKingFactory implements UsbSell {

    // 目标类：金士顿厂家，不接受用户单独购买
    @Override
    public float sell(int amount) {
        return 85.0f;
    }
}
