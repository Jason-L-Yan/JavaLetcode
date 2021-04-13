/**
 * 静态变量访问方式：“类名.”,也可以用 “引用.” 访问（不建议使用）
 * 空指针异常只有在什么情况下才会发生？
 * 只有在“空引用”访问“实例”相关的，都会出现空指针异常。
 * 
 */
public class StaticTest2 {
    
     public static void main(String[] args){
    
         
        // 静态变量访问方式：“类名.”,也可以用 “引用.” 访问（不建议使用）
        System.out.println(Chinese.country);
         
        Chinese c1 = new Chinese("123456789", "张三");  // new后面的是构造方法
        Chinese c2 = new Chinese("987456123", "李四");
        // 静态变量访问方式：“类名.”,也可以用 “引用.” 访问（不建议使用）
        System.out.println(c1.country);  // 不建议使用。
        
        System.out.println("**********************");
        c1 = null;
        // 不会出现空指针异常，因为country是static，本质上还是 System.out.println(Chinese.country);
        System.out.println(c1.country);
        
        // 此时会出现空指针异常，因为name是实例变量，而 c1 = null
        // System.out.println(c1.name);

     }
    
}

// 定义一个类：中国人
class Chinese{
    // 属性：身份证、姓名、国籍

    String idCard;  
    String name;  
    // *********************静态变量***********************************
    static String country = "中国"; 
    // 无参数
    public Chinese(){

    }
    // 有参数构造方法
    public Chinese(String s1, String s2){
        idCard = s1;
        name = s2;
    }
}
