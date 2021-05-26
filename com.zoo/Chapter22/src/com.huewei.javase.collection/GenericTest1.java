import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1、JDK5.0之后推出的新特性：泛型
2、泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参考的。（运行阶段泛型没用！）
3、使用了泛型好处是什么？
    第一：集合中存储的元素类型统一了。
    第二：从集合中取出的元素类型是泛型指定的类型，不需要进行大量的“向下转型”！

4、泛型的缺点是什么？
    导致集合中存储的元素缺乏多样性！
    大多数业务中，集合中元素的类型还是统一的。所以这种泛型特性被大家所认可。
 */
public class GenericTest1 {
    public static void main(String[] args) {
        // 不使用泛型机制，分析程序存在缺点
        // List myList = new ArrayList();
        // // 准备对象
        // Cat c = new Cat();
        // Bird b = new Bird();

        // // 将对象添加到集合中
        // myList.add(c);
        // myList.add(b);

        // // 遍历集合，取出每个Animal，让它move
        // Iterator it = myList.iterator();
        // while (it.hasNext()) {
        //     // 没有这个语法，通过迭代器取出的就是Object
        //     // Animal a = it.next();
        //     Object obj = it.next();
        //     if (obj instanceof Bird) {
        //         Bird b2 = (Bird) obj;
        //         b2.fly();
        //     } else if (obj instanceof Cat) {
        //         Cat c2 = (Cat) obj;
        //         c2.catchMouse();
        //     } else if (obj instanceof Animal) {
        //         Animal a2 = (Animal) obj;
        //         a2.move();
        //     }
        // }

        // 使用JDK5之后的泛型机制
        // 使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据。
        // 用泛型来指定集合中存储的数据类型。
        List<Animal>myList = new ArrayList<Animal>();

        // 指定List集合中只能存储Animal，那么存储String就编译报错了。
        // 这样用了泛型之后，集合中元素的数据类型更加统一了。
        // myList.add("abc");  // 报错，因为上方已经规定存储的内容。
        Cat c = new Cat();
        Bird b = new Bird();
        myList.add(c);
        myList.add(b);

        // 获取迭代器
        // 这个表示迭代器迭代的是Animal类型。
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()) {
            // 使用泛型之后，每一次迭代返回的数据都是Animal类型。
            //Animal a = it.next();
            // 这里不需要进行强制类型转换了。直接调用。
            //a.move();

            // 调用子类型特有的方法还是需要向下转换的！
            Animal a = it.next();
            if(a instanceof Cat) {
                Cat x = (Cat)a;
                x.catchMouse();
            }
            if(a instanceof Bird) {
                Bird y = (Bird)a;
                y.fly();
            }
        }

    }
}

class Animal {
    public void move() {
        System.out.println("动物在移动");
    }
}

class Cat extends Animal {
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("鸟儿在飞翔");
    }

}