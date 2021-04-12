package JavaLearning;

public class PersonTest2 {
    public static void main(String[] args){
        // 以下程序报错，因为age不能访问了。它的属性是私有的。
        /*
        Person p1 = new Person();
        System.out.println(p1.age);

        p1.age = 20;
        System.out.println(p1.age);
        */
        Person p1 = new Person();
        int nianLing = p1.getAge();
        System.out.println(nianLing);

        p1.setAge(18);
        System.out.println(p1.getAge());
        // System.out.println(p1.setAge(-100));
    }

    
}
