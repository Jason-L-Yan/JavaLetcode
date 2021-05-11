/**
 * 一维数组的深入，数组中存储的类型为：引用数据类型
 * 对于数组来说，实际上只能存储java对象的“内存地址”。数组中存储的每个元素是“引用”。
 */
package com.huawei.javaSE.array;

public class ArrayTest7 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = { a1, a2 };
        // Animal数组中可以存放Cat类型的数据，因为Cat是一个Animal。
        // Cat是Animal的子类。
        animals[1] = new Cat();

        for (int i = 0; i < animals.length; i++) {
            // Animal a = animals[i];
            // a.move();
            animals[i].move();
        }

        // 创建一个Animal类型的数组，数组当中存储子类Cat和Bird
        System.out.println("====================================");
        Animal[] anis = { new Cat(), new Birds() };
        for (int i = 0; i < anis.length; i++) {
            // Animal a = animals[i];
            // a.move();
            anis[i].move();
            // 这个取出来的可能是Cat，也可能是Bird，不过肯定是一个Animal
            // 如果调用的方法是父类中存在的方法不需要向下转型。直接使用父类型引用调用即可。
            // anis[i]
            // Animal an = anis[i];
            // an.move();

            // Animal中没有sing()方法。
            // anis[i].sing();

            // 调用子对象特有方法的话，需要向下转型！！！
            if (anis[i] instanceof Cat) {
                Cat c1 = (Cat) anis[i];
                c1.catchMouse();
            } else if(anis[i] instanceof Birds) {
                Birds b1 = (Birds) anis[i];
                b1.sing();
            }
        }

    }

}

class Animal {
    public void move() {
        System.out.println("Animal move......");
    }
}

class Cat extends Animal {

    @Override
    public void move() {
        System.out.println("猫在走猫步！");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠！");
    }

}

class Birds extends Animal {

    @Override
    public void move() {
        System.out.println("Birds Fly！");
    }

    public void sing() {
        System.out.println("鸟儿在歌唱！");
    }
}
