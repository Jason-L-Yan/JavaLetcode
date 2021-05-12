/**
 * һά��������룬�����д洢������Ϊ��������������
 * ����������˵��ʵ����ֻ�ܴ洢java����ġ��ڴ��ַ���������д洢��ÿ��Ԫ���ǡ����á���
 */
package com.huawei.javaSE.array;

public class ArrayTest7 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = { a1, a2 };
        // Animal�����п��Դ��Cat���͵����ݣ���ΪCat��һ��Animal��
        // Cat��Animal�����ࡣ
        animals[1] = new Cat();

        for (int i = 0; i < animals.length; i++) {
            // Animal a = animals[i];
            // a.move();
            animals[i].move();
        }

        // ����һ��Animal���͵����飬���鵱�д洢����Cat��Bird
        System.out.println("====================================");
        Animal[] anis = { new Cat(), new Birds() };
        for (int i = 0; i < anis.length; i++) {
            // Animal a = animals[i];
            // a.move();
            anis[i].move();
            // ���ȡ�����Ŀ�����Cat��Ҳ������Bird�������϶���һ��Animal
            // ������õķ����Ǹ����д��ڵķ�������Ҫ����ת�͡�ֱ��ʹ�ø��������õ��ü��ɡ�
            // anis[i]
            // Animal an = anis[i];
            // an.move();

            // Animal��û��sing()������
            // anis[i].sing();

            // �����Ӷ������з����Ļ�����Ҫ����ת�ͣ�����
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
        System.out.println("è����è����");
    }

    public void catchMouse() {
        System.out.println("èץ����");
    }

}

class Birds extends Animal {

    @Override
    public void move() {
        System.out.println("Birds Fly��");
    }

    public void sing() {
        System.out.println("����ڸ質��");
    }
}
