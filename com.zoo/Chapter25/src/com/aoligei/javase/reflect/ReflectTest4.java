package com.aoligei.javase.reflect;

/*
研究一下：Class.forName()发生了什么？
    记住，重点：
        如果你只是希望一个类的静态代码块执行，其它代码一律不执行，
        你可以使用：
            Class.forName("完整类名");
        这个方法的执行会导致类加载，类加载时，静态代码块执行。

提示：
    后面JDBC技术的时候我们还需要。
 */
public class ReflectTest4 {
    public static void main(String[] args) {
        Class c;
        try {
            c = Class.forName("com.aoligei.javase.reflect.MyClass");
            // 上句代码执行结果：MyClass类的静态代码块执行了！
            c.newInstance();
            // 上两句句代码执行结果：
            // MyClass类的静态代码块执行了！
            // 无参构造器执行了！
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    static {
        System.out.println("MyClass类的静态代码块执行了！");
    }

    public MyClass() {
        System.out.println("无参构造器执行了！");
    }

}
