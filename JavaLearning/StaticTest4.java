// package JavaLearning;

public class StaticTest4 {
    public static void main(String[] args){
        // User.getId();
        User2 u = new User2();
        System.out.println(u.getId());
        u.getId();

    }
    
}

class User2{
    // 实例变量，需要对象
    private int id;  // 默认值为 0

    // 以下两个静态方法会报错，因为他们引用了id，id是非静态的，必须创建对象；
    // public static void setId(int i){
    //     id = i;
    // }

    // public static int getId(){
    //     return id;
    // }

    // 这样通过对象调用便不会报错
    // 方法体中访问了实例变量，这个方法一定是实例方法。
    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }
}
