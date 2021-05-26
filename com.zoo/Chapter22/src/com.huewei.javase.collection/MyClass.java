import java.util.HashSet;
import java.util.Set;

public class MyClass {
    
    // 声明一个静态内部类
    private static class InnerClass {
        public static void m1() {
            System.out.println("静态内部类的静态方法m1执行");
        }

        public void m2() {
            System.out.println("静态内部类的实例方法m2执行");
        }
    }

    public static void main(String[] args) {
        MyClass.InnerClass.m1();
        MyClass.InnerClass MI = new MyClass.InnerClass();
        MI.m2(); 

        // 给一个Set集合
        // 该Set集合中存储的对象是：MyClass.InnerClass类型
        Set<MyClass.InnerClass> set = new HashSet<>();

        // 这个Set集合中存储的是字符串对象。
        Set<String> set2 = new HashSet<>();

        Set<MyMap.MyEntry<Integer, String>> set3 = new HashSet<>();
    }
}

class MyMap {
    public static class MyEntry<K, V> {

    }
}
