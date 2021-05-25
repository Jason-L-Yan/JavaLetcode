import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
���ڼ���Ԫ�ص�remove
    �ص㣺�����ϵĽṹ�����ı�ʱ���������������»�ȡ�������������ǰ�ϵĵ������������
    �쳣��java.util.ConcurrentModificationException

    �ص㣺�ڵ�������Ԫ�صĹ����У����ܵ��ü��϶����remove������ɾ��Ԫ�أ�
        c.remove(o); ���������в���������
        ����֣�java.util.ConcurrentModificationException

    �ص㣺�ڵ���Ԫ�صĹ��̵��У�һ��Ҫʹ�õ�����Iterator��remove������ɾ��Ԫ�أ�
    ��Ҫʹ�ü����Դ���remove����ɾ��Ԫ�ء�

 */

public class CollectionTest6 {
    public static void main(String[] args) {
        // ��������
        Collection c = new ArrayList();

        // ע�⣺��ʱ��ȡ�ĵ�������ָ��������Ǽ�����û��Ԫ��״̬�µĵ�������
        // һ��Ҫע�⣺���ϽṹֻҪ�����ı䣬�������������»�ȡ��
        // �����Ͻṹ�����˸ı䣬������û�����»�ȡʱ������next()����ʱ��java.util.ConcurrentModificationException
        // Iterator it = c.iterator();

        // ���Ԫ��
        c.add(1); // Integer����
        c.add(2);
        c.add(3);

        // ��ȡ������
        Iterator it = c.iterator();
        while(it.hasNext()){
            // ��д����ʱnext()��������ֵ���ͱ�����Object��
            // Integer i = it.next();  // ����
            Object obj = it.next();
            System.out.println(obj);
        }

        Collection c2 = new ArrayList();
        c2.add("abc");
        c2.add("def");
        c2.add("xyz");

        Iterator it2 = c2.iterator();
        while(it2.hasNext()){
            Object o = it2.next();
            // ɾ��Ԫ��
            // ɾ��Ԫ��֮�󣬼��ϵĽṹ�����˱仯��Ӧ������ȥ��ȡ������
            // ���ǣ�ѭ����һ�ε�ʱ��û�����»�ȡ�����������Ի�����쳣��java.util.ConcurrentModificationException
            // ���쳣����ԭ���ǣ�������Ԫ��ɾ���ˣ�����û�и��µ���������������֪�����ϱ仯�ˣ�

            // c2.remove(o); // ֱ��ͨ������ȥɾ��Ԫ�أ�û��֪ͨ�������������µ������Ŀ��պ�ԭ����״̬��ͬ����

            // ʹ�õ�������ɾ��������
            // ������ȥɾ��ʱ�����Զ����µ����������Ҹ��¼��ϣ�ɾ�������е�Ԫ�أ���
            it2.remove(); // ɾ����һ���ǵ�����ָ��ĵ�ǰԪ�ء�
            System.out.println(o);
        }

        System.out.println(c2.size()); //0
    }
}
