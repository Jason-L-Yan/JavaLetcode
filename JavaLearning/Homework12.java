// package JavaLearning;

public class Homework12 {
    public static void main(String[] args){
        // 创建丈夫对象（丈夫还没有妻子）
        Husband h = new Husband("111111", "张三", "1999-10-11", null);
        // 创建妻子对象（妻子还没有丈夫）
        Wife w = new Wife("222222", "翠花", "2002-10-11", null);
        // 让他俩结婚
        h.wife = w;
        w.husband = h;
        // 输出他俩信息
        System.out.println(h.name);
        System.out.println(h.name + "的妻子是" + h.wife.name);
        System.out.println(w.name + "的丈夫是" + w.husband.name);

    }
    
}

class Husband{
    String idCard;
    String name;
    String birth;
    Wife wife;  // 引用数据类型，像String一样，wife中存储的是地址，默认是none。

    // 构造方法
    // 无参
    public Husband(){

    }

    // 有参
    public Husband(String s1, String s2, String s3, Wife w){
        idCard = s1;
        name = s2;
        birth = s3;
        wife = w;

    }

}

class Wife{
    String idCard;
    String name;
    String birth;
    Husband husband;  // 引用数据类型，像String一样，wife中存储的是地址，默认是null。

    // 构造方法
    // 无参
    public Wife(){

    }

    // 有参
    public Wife(String s1, String s2, String s3, Husband h){
        idCard = s1;
        name = s2;
        birth = s3;
        husband = h;
        
    }

}