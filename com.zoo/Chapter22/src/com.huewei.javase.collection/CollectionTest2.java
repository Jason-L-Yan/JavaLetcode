import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * ���ڼ��ϱ���/����ר�⡣���ص㣺�����*****��
 */
public class CollectionTest2 {
    public static void main(String[] args) {
        // ע�⣺���½���ı�����ʽ/������ʽ��������Collectionͨ�õ�һ�ַ�ʽ��
        // ��Map�����в����á������е�Collection�Լ�������ʹ�á�
        // �������϶���
        Collection c = new ArrayList(); // ����ļ�������ν����Ҫ�ǿ�ǰ���Collection�ӿڣ���ô����/������
        // ���Ԫ��
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());
        // �Լ���Collection���б���/����
        // ��һ������ȡ���϶���ĵ���������Iterator
        Iterator it = c.iterator();
        // �ڶ�����ͨ�����ϻ�ȡ�ĵ���������ʼ����/�������ϡ�
        /*
         * �������������ǵ���������Iterator�еķ����� boolean hasNext()�������Ԫ�ؿ��Ե������򷵻� true�� Object next()
         * ���ص�������һ��Ԫ�ء�
         */
        // for (int i = 0; i < c.size(); i++) {
        //     boolean hasNext = it.hasNext();
        //     if (hasNext) {
        //         System.out.println(it.next());
        //     }
        // }
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

    }
}
