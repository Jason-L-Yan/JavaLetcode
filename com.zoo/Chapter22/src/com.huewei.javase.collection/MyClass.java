import java.util.HashSet;
import java.util.Set;

public class MyClass {
    
    // ����һ����̬�ڲ���
    private static class InnerClass {
        public static void m1() {
            System.out.println("��̬�ڲ���ľ�̬����m1ִ��");
        }

        public void m2() {
            System.out.println("��̬�ڲ����ʵ������m2ִ��");
        }
    }

    public static void main(String[] args) {
        MyClass.InnerClass.m1();
        MyClass.InnerClass MI = new MyClass.InnerClass();
        MI.m2(); 

        // ��һ��Set����
        // ��Set�����д洢�Ķ����ǣ�MyClass.InnerClass����
        Set<MyClass.InnerClass> set = new HashSet<>();

        // ���Set�����д洢�����ַ�������
        Set<String> set2 = new HashSet<>();

        Set<MyMap.MyEntry<Integer, String>> set3 = new HashSet<>();
    }
}

class MyMap {
    public static class MyEntry<K, V> {

    }
}
