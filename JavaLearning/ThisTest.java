// package JavaLearning;
/**
 * 一个对象有一个this，
 * this是一个变量，一个引用。this保存当前对象的内存地址，指向自身。
 * 所以，严格意义上来说，this代表“当前对象”
 * this存储在堆内存当中的对象的内部。
 * this只能使用在实例方法中，谁调用这个实例方法，this就是谁。所以this代表当前对象。
 */
public class ThisTest {
    public static void main(String[] args){
        Customer c1 = new Customer("张三");
        c1.shopping();
        Customer c2 = new Customer("李四");
        c2.shopping();

    }
}


class Customer{
    // 属性
    // 实例变量, 访问需要new对象 "引用." 。
    String name;

    // 构造方法
    public Customer(){

    }

    public Customer(String s){
        // 此处没有添加“引用.”也能访问，前面默认添加 “this.”,这也是引用。以下两句话是一样的。
        this.name = s;
        name = s;
    }

    // 实例方法
    public void shopping(){
        // 此处没有添加“引用.”也能访问，前面默认添加 “this.”,这也是引用。以下两句话是一样的。
        System.out.println(name + "正在购物");
        System.out.println(this.name + "正在购物");
    }
}
