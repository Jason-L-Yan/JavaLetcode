import java.util.TreeSet;

/*
���Զ����������˵��TreeSet����������
    ���³����ж���Person������˵���޷�������Ϊû��ָ��Person����֮��ıȽϹ���
    ˭��˭С��û��˵������

    ���³������е�ʱ�����������쳣��
        java.lang.ClassCastException:
            class com.bjpowernode.javase.collection.Person
            cannot be cast to class java.lang.Comparable
    ��������쳣��ԭ���ǣ�
        Person��û��ʵ��java.lang.Comparable�ӿڡ�
 */
public class TreeSetTest3 {
    public static void main(String[] args) {
        Person p1 = new Person(32);
        System.out.println(p1);  // Person [age=32]
        Person p2 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(25);

        // ����TreeSet����
        TreeSet<Person> persons = new TreeSet<>();
        // ���Ԫ��
        persons.add(p1);
        // ��ӵڶ���Ԫ��ʱ������֪���������
        // ClassCastException
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        // ����
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}

class Person {
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + "]";
    }
   
}