// package JavaLearning;

/**
 * 除了静态代码块之外，还有语句块叫做：实例语句块
 * 实例语句块不会再类加载时执行
 * 语法：
 * {
 *     java语句；
 *     java语句；
 * }
 * 只要构造方法执行，必定在构造方法之前执行实例语句块
 * 也是一个时机，是对象构建时机。
 */
public class InstanceTest {

    // 入口
    public static void main(String[] args){
        System.out.println("main begin....");
        new InstanceTest();
        new InstanceTest();
        new InstanceTest("张三");

    }

    // 实例语句块,不会再类加载时执行，在构造方法执行之前执行。
    {
        System.out.println("实例语句块执行");
    }
    // 构造方法
    public InstanceTest(){
        System.out.println("无参数构造方法");
    }
    
    // 有参数构造方法
    public InstanceTest(String name){
        System.out.println("有参数构造方法");
    }
}
