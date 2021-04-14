// package JavaLearning;

public class CodeOrder {
    static {
        System.out.println("A");
    }
    public static void main(String[] args){
        System.out.println("main begin");
        new CodeOrder();
        System.out.println("main over!");
    }
    
    // 构造方法
    public CodeOrder(){
        System.out.println("构造方法");
    }

    {
        System.out.println("C");
    }
    
    static {
        System.out.println("X");
    }
}
