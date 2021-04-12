package JavaLearning;

public class Test7 {
    public static void main(String[] args){
        Person p = new Person();
        p.age = 10;
        add(p);
        System.out.println("add---->" + p.age);  // 11
    }

    public static void add(Person p){
        p.age++;
        System.out.println("add---->" + p.age);  // 11
    }
}


class Person{
    int age;
}
