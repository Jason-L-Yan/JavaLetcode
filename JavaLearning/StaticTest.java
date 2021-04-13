// package JavaLearning;

// public class StaticTest {
//     /**
//      * 什么时候声明为静态，什么时候为实例的
//      */
//      public static void main(String[] args){
//          // 方法无论是静态的还是动态的，只要调用运行的时候，都会在栈中压栈。
//          // 构造方法也会压栈，执行完弹栈，然后再堆中创建一个对象。
//          // 堆里存实例变量、栈里存局部变量。
//          // c1、c2为局部变量
//          Chinese c1 = new Chinese("123456789", "张三", "中国");  // new后面的是构造方法
//          Chinese c2 = new Chinese("987456123", "李四", "中国");
//          System.out.println(c1.name);
//          System.out.println(c1.idCard);
//          System.out.println(c1.country);
//          System.out.println(c2.name);
//          System.out.println(c2.idCard);
//          System.out.println(c2.country);


//      }
    
// }

// // 定义一个类：中国人
// class Chinese{
//     // 属性：身份证、姓名、国籍

//     String idCard;  // 每一个人身份证号不同，一人一份，所以应该是实例变量
//     String name;  // 姓名也应该是一人一个
//     String country;  // 类名是中国人，国籍不随着对象的改变而改变，国籍不是对象级的特征。

//     // 构造方法
//     // 无参数构造方法
//     public Chinese(){

//     }
//     // 有参数构造方法
//     public Chinese(String s1, String s2, String s3){
//         idCard = s1;
//         name = s2;
//         country = s3;
//     }
// }


public class StaticTest {
    /**
     * 什么时候声明为静态，什么时候为实例的。
     * 如果这个类型所有对象的某个属性都是一样的，
     * 不建议定义为实例变量，定义为静态变量
     */
     public static void main(String[] args){
         // 方法无论是静态的还是动态的，只要调用运行的时候，都会在栈中压栈。
         // 构造方法也会压栈，执行完弹栈，然后再堆中创建一个对象。
         // 堆里存实例变量、栈里存局部变量。
         // c1、c2为局部变量
         // 静态变量访问方式：“类名.”
         System.out.println(Chinese.country);
         // 以下语句不能编译，因为name是实例变量，需要对象访问
         //  System.out.println(Chinese.name);
         Chinese c1 = new Chinese("123456789", "张三");  // new后面的是构造方法
         Chinese c2 = new Chinese("987456123", "李四");
         System.out.println(c1.idCard);
         System.out.println(c1.name);
         System.out.println(c2.idCard);
         System.out.println(c2.name);

     }
    
}

// 定义一个类：中国人
class Chinese{
    // 属性：身份证、姓名、国籍

    String idCard;  
    String name;  
    // *********************静态变量***********************************
    // *********************静态变量***********************************
    // 静态变量在类加载时初始化，不需要new对象，静态变量的空间就开出来了
    // 静态变量存储在方法区
    static String country = "中国"; 

    // 构造方法
    // 无参数构造方法
    public Chinese(){

    }
    // 有参数构造方法
    public Chinese(String s1, String s2){
        idCard = s1;
        name = s2;
    }
}
