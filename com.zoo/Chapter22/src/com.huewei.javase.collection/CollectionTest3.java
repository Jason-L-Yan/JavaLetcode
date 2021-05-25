import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest3 {
    public static void main(String[] args) {
        // �������϶���
        Collection c1 = new ArrayList(); // ArrayList������ظ�

        // ���Ԫ��
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);

        // ��������
        Iterator it = c1.iterator(); // ǰ��Iterator�Ǵ�д���ǽӿڣ�����iterator()Сд���Ƿ�����
        while (it.hasNext()) {
            // ���ȥ��ʲô�������ͣ�ȡ���໹��ʲô�������͡�
            Object obj = it.next();
            if (obj instanceof Integer) {
                // ֻ�����������ʱ���ת�����ַ�������Ϊ����println�����toString()����������̨��ӡ�ľ����ַ�����
                System.out.println("Integer���͡�");
            }

            System.out.println(obj);
        }

        // ���򲻿��ظ���
        Collection c2 = new HashSet();
        // ���Ԫ��
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(400);
        c2.add(100);
        // ��������
        Iterator it2 = c2.iterator(); // ǰ��Iterator�Ǵ�д���ǽӿڣ�����iterator()Сд���Ƿ�����
        while (it2.hasNext()) {
            // ���ȥ��ʲô�������ͣ�ȡ���໹��ʲô�������͡�
            Object obj = it2.next();
            // if (obj instanceof Integer) {
            // // ֻ�����������ʱ���ת�����ַ�������Ϊ����println�����toString()����������̨��ӡ�ľ����ַ�����
            // System.out.println("in");
            // }

            System.out.println(obj);
        }

    }
}
