public class SuperTest1{
    public static void main(String[] args){
        new B();
    }
}


class A{
    // 如果手动提供一个有参数构造方法，无参构造方法将不再提供。
    // 无参构造方法
    public A(){
        System.out.println("A类无参数构造方法！");
    }
    public A(int i){
        System.out.println("A类有参数构造方法！（int）");
    }
}


// this与super不能共存，都只能在第一行，既没有super也没有this，系统会默认提供一个super方法
class B extends A{
    public B(){
        this("zhangSan");
        // super();
        // 默认存在 super()
        // super(100);  // 写过这句话之后，super()将不存在。
        System.out.println("B类无参数构造方法！");
    }

    public B(String name){
        super();
        System.out.println("B类有参数构造方法。");
    }
}
