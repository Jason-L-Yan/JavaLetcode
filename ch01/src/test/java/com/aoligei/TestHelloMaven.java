package com.aoligei;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {

    @Test
    public void testAdd() {
        System.out.println("====测试1====");
        HelloMaven hello = new HelloMaven();
        int res = hello.add(10, 20);
        Assert.assertEquals(30, res);
    }

    @Test
    public void testAdd2() {
        System.out.println("====测试2====");
        HelloMaven hello = new HelloMaven();
        int res = hello.add(10, 20);
        Assert.assertEquals(30, res);
    }
}
