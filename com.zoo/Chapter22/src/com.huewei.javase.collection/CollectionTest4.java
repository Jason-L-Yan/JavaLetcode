import java.util.ArrayList;
import java.util.Collection;

/*
����Collection���ϵ�contains������
    boolean contains(Object o)
        �жϼ������Ƿ����ĳ������o
        �����������true�� �������������false��

    contains�����������жϼ������Ƿ����ĳ��Ԫ�صķ�����
    ��ô���ڵײ�����ô�жϼ������Ƿ����ĳ��Ԫ�ص��أ�
        ������equals�������бȶԡ�
        equals��������true���ͱ�ʾ�������Ԫ�ء�
 */
public class CollectionTest4 {
    public static void main(String[] args) {
        // �������϶���
        Collection c = new ArrayList();

        // �򼯺��д洢Ԫ��
        String s1 = new String("abc"); // s1 = 0x1111
        c.add(s1); // �Ž�ȥ��һ��"abc"

        String s2 = new String("def"); // s2 = 0x2222
        c.add(s2);

        // ������Ԫ�صĸ���
        System.out.println("Ԫ�صĸ����ǣ�" + c.size()); // 2

        // �½��Ķ���String
        String x = new String("abc"); // x = 0x5555
        // c�������Ƿ����x������²�һ����true����false��
        System.out.println(c.contains(x)); // �жϼ������Ƿ����"abc" true

    }
}
