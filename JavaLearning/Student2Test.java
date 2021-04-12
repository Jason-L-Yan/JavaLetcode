package JavaLearning;
// @SuppressWarnings("unused")  // 屏蔽变量未使用警告
public class Student2Test {
    public static void main(String[] args){
        // 创建学生对象1
        // 此处 s1、s2 是局部变量。
        // 局部变量存储在栈内存中
        // 不能通过"类名.成员变量"访问实例变量。
        // s1、s2在此处也叫做引用
        // 对象与引用的区别
        // 对象是通过new出来的，在堆内存中存储。
        // 引用是：但凡是变量，并且该变量中保存了内存地址指向了堆内存中的对象的 。
        Student2 s1 = new Student2();
        System.out.println();
        System.out.println("*************对象s1赋值前****************");
        System.out.println(s1.no);
        System.out.println(s1.name);
        System.out.println(s1.sex);
        System.out.println(s1.address);
        System.out.println("*************赋值后****************");
        s1.no = 100;
        s1.name = "张三";
        s1.age = 20;
        s1.sex = true;
        s1.address = "江苏徐州";
        System.out.println(s1.no);
        System.out.println(s1.name);
        System.out.println(s1.sex);
        System.out.println(s1.address);
        System.out.println("*************对象s2赋值前****************");
        
        // 创建学生对象2
        Student2 s2 = new Student2();
        System.out.println(s2.no);
        System.out.println(s2.name);
        System.out.println(s2.sex);
        System.out.println(s2.address);
    }
    
}
