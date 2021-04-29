public class AbstractTest {
    public static void main(String[] args){
        // 能不能使用多态？
        // 父类型引用指向子类对象。
        Animal a = new Bird();  // 子类Bird()是非抽象的，可以实例化
    }
}


abstract class Animal{

    // 抽象方法
    public abstract void move2();
//    public void move3(){
//
//    }
}


// 子类非抽象，继承含抽象方法的抽象类,必须重写（覆盖）抽象方法，否则会报错。
class Bird extends Animal {
    @Override
    public void move2() {
        System.out.print("鸟儿在飞翔。");
    }
}


// 子类如果是抽象类，继承没有什么问题。
abstract class Bird2 extends Animal{

}