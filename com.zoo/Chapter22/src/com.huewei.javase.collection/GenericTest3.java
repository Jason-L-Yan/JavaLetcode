/*
�Զ��巺�Ϳ����𣿿���
    �Զ��巺�͵�ʱ��<> �������е���һ����ʶ�������д��
    javaԴ�����о������ֵ��ǣ�
        <E>��<T>
    E��Element��������ĸ��
    T��Type��������ĸ��
 */
public class GenericTest3<��ʶ�����дHello> {
    public  void doSome(��ʶ�����дHello k) {
        System.out.println(k);
    }

    public static void main(String[] args) {
        // new�����ʱ��ָ���˷����ǣ�String����
        // <String>ָ���� ����ʶ�����дHello�� ��String
        GenericTest3<String> gt = new GenericTest3<>();

        // ���Ͳ�ƥ��
        // gt.doSome(100);
        gt.doSome("abc");
        
        // ================================================
        GenericTest3<Integer> gt2 = new GenericTest3<>();
        gt2.doSome(100);
        // ���Ͳ�ƥ��
        // gt2.doSome("100");

        MyIterator<String> mi = new MyIterator<>();
        String s1 = mi.get();
        System.out.println(s1);

        MyIterator<Animal> mi2 = new MyIterator<>();
        Animal a = mi2.get();
        System.out.println(a);

        // ���÷��;���Object���͡�
        // GenericTest3 gt3 = new GenericTest3();
        // gt3.doSome(new Object());
    }
}

class MyIterator<T> {
    public T get() {
        return null;
    }
}
