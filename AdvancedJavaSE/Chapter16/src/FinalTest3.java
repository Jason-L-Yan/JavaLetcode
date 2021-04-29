public class FinalTest3 {
    public static void main(String[] args) {
        User u2 = new User(200);

    }
}


class User{
    // 实例变量，如果没有赋值，系统会赋默认值。而final定义的实例变量，必须手动附初始值，否则会报错。
    // final int age;  // 如上所述，会报错

    // 在构造器中对final实例变量赋值不会报错,是因为实例变量赋默认值是在构造其中完成的，
    // 所以在系统赋默认值之前，在构造器中给final变量赋初始值是可以的。
    final double weight;
    final double height;

    public User(double height){
        System.out.println("Hello");
        this.weight = 80;
        this.height = height;
    }


}