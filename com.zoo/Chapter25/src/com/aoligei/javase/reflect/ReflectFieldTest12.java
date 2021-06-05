package com.aoligei.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.aoligei.javase.bean.Vip;

/*
比上一个例子(ReflectTest11)重要一些！！！

通过反射机制调用构造方法实例化java对象。（这个不是重点）
 */
public class ReflectFieldTest12 {
    public static void main(String[] args) {
        Vip v1 = new Vip();
        Vip v2 = new Vip(110, "zhangsan", "2001-10-11", true);

        Class c = null;
        // 使用反射机制怎么创建对象呢？
        try {
            c = Class.forName("com.aoligei.javase.bean.Vip");
            Object obj = c.newInstance();
            System.out.println(obj);
            // 调用有参数的构造方法怎么办？
            // 第一步：先获取到这个有参数的构造方法
            Constructor con =  c.getDeclaredConstructor(int.class, String.class, String.class, boolean.class);
            // 第二步：调用构造方法创建对象
            Object obj2 = con.newInstance(110, "jason", "1900-10-11", true);
            System.out.println(obj2);

            // 获取无参数构造方法
            Constructor con2 = c.getDeclaredConstructor();
            Object newObj2 = con2.newInstance();
            System.out.println(newObj2);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
