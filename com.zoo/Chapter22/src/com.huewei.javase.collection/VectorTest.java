import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
/*
Vector��
    1���ײ�Ҳ��һ�����顣
    2����ʼ��������10
    3����ô���ݵģ�
        ����֮����ԭ������2����
        10--> 20 --> 40 --> 80

    4��ArrayList���������ص㣺
        ArrayList����������ԭ����1.5����

    5��Vector�����еķ��������߳�ͬ���ģ�������synchronized�ؼ��֣�
    ���̰߳�ȫ�ġ�Ч�ʱȽϵͣ�ʹ�ý����ˡ�

    6����ô��һ���̲߳���ȫ��ArrayList����ת�����̰߳�ȫ���أ�
        ʹ�ü��Ϲ����ࣺ
            java.util.Collections;

            java.util.Collection �Ǽ��Ͻӿڡ�
            java.util.Collections �Ǽ��Ϲ����ࡣ
 */
public class VectorTest {
    public static void main(String[] args) {
        // ����һ��Vector����
        List vector = new Vector();
        // Vector vector = new Vector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        // ����֮�����ݣ�����֮���������20��
        vector.add(11);

        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }

        List myList = new ArrayList();
        Collections.synchronizedList(myList);
        myList.add("111");
        myList.add("222");
        myList.add("333");
    }
}
