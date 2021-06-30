package com.aoligei;

import com.aoligei.shangjia.Taobao;

public class ShopMain {
    public static void main(String[] args) {
        Taobao taobao = new Taobao();
        float price = taobao.sell(1);
        System.out.println("返回优惠券，有红包");
        System.out.println("通过淘宝商家购买的单价：" + price);
    }
}
