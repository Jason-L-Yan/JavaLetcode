// package JavaLearning;

public class StaticTest3 {
    public static void main(String[] args){
        StaticTest3.doSome();
        StaticTest3 s = new StaticTest3();
        // s = null;  // 不影响静态方法的调用。
        s.doSome();
        // s.doOther();  // 空指针异常，受 s = null 的影响
        
        // StaticTest3.doOther();  // 不能通过类名调用，因为他是实例方法，没有static
        

    }
    
    // 静态方法不需要 new 对象，直接使用 类名.  的方式访问
    // 但是也可以使用 引用. 的方式访问，但是不建议使用。
    public static void doSome(){
        System.out.println("静态方法doSome执行了");

    }
    // 实例方法，需要 new 对象，使用 “引用.” 的方式访问
    public void doOther(){
        System.out.println("实例方法doOther执行了。");
    }
}
