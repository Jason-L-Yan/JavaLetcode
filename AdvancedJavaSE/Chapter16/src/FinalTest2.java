public class FinalTest2 {

    public static void main(String[] args) {
        // 局部变量没有初始值，不能直接输出
        int i;
        // System.out.println(i);
        Person2 p1 = new Person2();
        System.out.println(p1.age);
        // ---------------------------------
        final Person2 p = new Person2(30);
        System.out.println(p.age);
        // 对象中的变量，可以更改。
        p.age = 40;
        System.out.println(p.age);
        // 无法运行
        // p = new Person2(25);

    }
}


class Person2{
    int age;

    public Person2() {
    }

    public Person2(int age) {
        this.age = age;
    }
}