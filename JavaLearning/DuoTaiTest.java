/**
 * 多态的基础语法
 * 1. 学习多态基础语法之前，我们需要普及两个概念
 *      - 第一个：向上转型
 *          子-----> 父
 *      - 第二个：向下转型
 *          父-----> 子
 * 注意：java中允许向上转型，也不许向下转型。无论是向上转型，还是向下转型，两种类型之间必须有继承关系，
 * 没有继承关系，编译器会报错。
 */


public class DuoTaiTest {
    
    public static void main(String[] args){
        Animals a1 = new Animals();
        a1.move();

        Cats c1 = new Cats();
        c1.move();

        Birdss b1 = new Birdss();
        b1.move();

        // 代码可以这样写吗？
        /**
         * 1. Animal和Cat之间有继承关系吗？有的。
         * 2. Animal是父类，Cat是子类。
         * 3. Cat is Animal，这句话能不能说通？能。
         * 4. 经测试java支持这样一个用法：
         * 父类型的引用允许指向子类型的对象。
         * Animals a2 = new Cats();
         * a2是父类型的引用。new Cats()是一个子类型的对象。
         * 允许a2这个父类型引用指向子类型的对象。
         */
        System.out.println("***************************");
        /**
         * 什么是多态？
         * 多种形态，多种状态。
         * 分析 a2.move():
         * java程序分为编译阶段和运行阶段。
         * 先来分析编译阶段：对于编译器来说，编译器只知道a2的类型是Animals，
         * 所以编译器在检查语法的时候，会去Animals.class字节码中找move()方法，
         * 找到之后，绑定上move()方法,编译通过，静态绑定成功。（编译阶段属于静态绑定）
         * 再来分析运行阶段：运行阶段的时候，实际上在堆内存中创建java对象是Cat对象，所以move的时候，
         * 真正参与move()的对象是一只猫，所以运行阶段会动态执行Cat对象的move()方法。这个过程属于运行
         * 阶段绑定。（运行阶段绑定属于动态绑定。）
         * 多态表示多种形态：
         * 编译时一种形态
         * 运行时另一种形态
         * 
         */
        // 向上转型
        Animals a2 = new Cats();
        a2.move();

        Animals a3 = new Birdss();
        a3.move();

        // ==========================================================
        Animals a5 = new Cats();  // 底层对象是一只猫。
        // a5.catchMouse();  // catchMouse()是Cats.class独有的方法。
        // 分析能否编译通过和运行？
        // 分析程序一定要分析编译阶段的静态绑定和运行阶段的动态绑定。
        // 错误：找不到符号
        // 因为编译器只知道a5的类型是Animals，去Animals.class文件中找不到catchMouse()方法。
        // 所以静态绑定失败，编译报错。
        

    }
}
