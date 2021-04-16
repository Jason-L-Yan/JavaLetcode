/**
 * 子类继承父类之后，继承过来的某些方法无法满足当前子类业务需求时，可以进行“方法覆盖”
 * 方法覆盖又叫方法重写、方法重写（override或overwrite）。
 * 回顾一下重载
 * 什么时候使用方法重载（overload）？不同于方法重写。
 * - 当在一个类当中，如果功能相似，建议将名字定义的一样，这样代码美观，并且方便编程。
 * 
 */
public class OverrideTest {
    public static void main(String[] args){
        Birds bird = new Birds();
        bird.move();

        Cat2 cat = new Cat2();
        cat.move();

    }
    
}


class Animal2{
    
    public void move(){
        System.out.println("动物在移动！");
    }
}


class Birds extends Animal2{

    // 子类继承父类之后，部分功能可能需要改进。
    // 对move方法进行覆盖，方法重写，override
    // 最好将父类中的方法原封不动的复制过来（不建议手动编写）
    public void move(){
        System.out.println("鸟儿在飞翔！");
    }
      
}


class Cat2 extends Animal2{
    
    public void move(){
        System.out.println("猫在走猫步！");
    }

} 