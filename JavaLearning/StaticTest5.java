// package JavaLearning;
/**
 * 使用static关键字可以定义：静态代码块
 * 什么是静态代码块，语法是什么：
 * static{
 *    java语句；
 *    java语句；
 * static静态代码块在什么时候执行？
 * 类加载时执行。并且执行一次。
 * 
 * }
 */

public class StaticTest5 {

    // 静态代码块
    static {
        System.out.println("A");
    }

    // 一个类中可以编写多个静态代码块
    static {
        System.out.println("B");
    }
    // 程序入口
    public static void main(String[] args){
        System.out.println("Hello world");
        
    }

    // 编写静态代码块
    static {
        System.out.println("C");
    }
    
}
