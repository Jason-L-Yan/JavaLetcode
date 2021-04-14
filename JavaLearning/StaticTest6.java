// package JavaLearning;
/**
 * 栈：方法执行，会压栈；（局部变量）
 * 堆：new 出来的对象都在堆中，垃圾回收机制主要针对（实例变量）
 * 方法区：类的信息，字节码信息，代码片段。（静态变量）
 * 方法的代码片段在方法区，但是执行过程当中需要的内存在栈中。
 */
public class StaticTest6 {
    // 静态变量什么时候初始化？类加载时初始化
    // 静态变量存储在哪里？方法区
    static int i = 100;

    // 静态代码块什么时候执行？类加载时执行。
    static{
        System.out.println("i = " + i);
    }
    // 只要是代码一定存储在方法区
    // 方法区放静态变量和代码片段
    //*************************************** */
    // 实例变量
    int k = 100;

    // static {
    //     // k变量此时能访问吗？
    //     // 在这里不能访问，因为k是实例方法，在构造方法执行时才会开辟。而静态方法在
    //     // 类加载时就已执行，此时k还没有开辟空间，所以不能执行。
    //     System.out.println("k = " + k);
    // }

    //****************以下顺序颠倒不能执行，因为执行顺序是自上而下*********************** */
    // 静态代码块什么时候执行？类加载时执行。
    // static{
    //     System.out.println(name);
    // }

    // static String name = "你好";

    public static void main(String[] args){
        System.out.println("main 入口开始执行");
    }
    
}

/**
 * 总结：但目前为止，遇到的java程序有顺序要求的是哪些？
 * 1. 对于一个方法来说，方法体中的代码是有顺序的，遵循自上而下的顺序
 * 2. 静态代码块1与静态代码块2是有顺序的
 * 3. 静态代码块和静态变量是有先后顺序的。
 * 
 */
