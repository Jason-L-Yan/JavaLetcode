import java.util.ArrayList;
import java.util.Collection;

/*
����java.util.Collection�ӿ��г��õķ�����
    1��Collection���ܴ��ʲôԪ�أ�
        û��ʹ�á����͡�֮ǰ��Collection�п��Դ洢Object�����������͡�
        ʹ���ˡ����͡�֮��Collection��ֻ�ܴ洢ĳ����������͡�
        ���Ϻ������ǻ�ѧϰ�����͡��﷨��Ŀǰ�Ȳ��ùܡ�Collection��ʲô���ܴ棬
        ֻҪ��Object�������;��С��������в���ֱ�Ӵ洢�����������ͣ�Ҳ���ܴ�
        java����ֻ�Ǵ洢java������ڴ��ַ����
    2��Collection�еĳ��÷���
        boolean add(Object e) �򼯺������Ԫ��
        int size()  ��ȡ������Ԫ�صĸ���
        void clear() ��ռ���
        boolean contains(Object o) �жϵ�ǰ�������Ƿ����Ԫ��o����������true������������false
        boolean remove(Object o) ɾ�������е�ĳ��Ԫ�ء�
        boolean isEmpty()  �жϸü�����Ԫ�صĸ����Ƿ�Ϊ0
        Object[] toArray()  ��������������԰Ѽ���ת�������顣����Ϊ�˽⣬ʹ�ò��ࡣ��
 */
public class CollectionTest {
    public static void main(String[] args) {
        // ����һ�����϶���
        // Collection c = new Collection();   // �ӿ��ǳ���ģ��޷�ʵ������
        Collection c = new ArrayList();
        // ����Collection�ӿ��еĳ��÷���
        c.add(1200);  // �Զ�װ��(java5�������ԡ�),ʵ�����ǷŽ�ȥ��һ��������ڴ��ַ��Integer x = new Integer(1200);
        c.add(3.14);  // �Զ�װ��(java5�������ԡ�)
        c.add(new Object());
        c.add(new Student());
        c.add(true);  // �Զ�װ��(java5�������ԡ�)

        // ��ȡ������Ԫ�ظ���
        System.out.println("������Ԫ�ظ�����" + c.size());
        
        // ��ռ���
        c.clear();
        System.out.println("������Ԫ�ظ�����" + c.size());
        // ���򼯺������Ԫ��
        c.add("Hello");
        c.add("World");
        c.add("�ƿ�");
        c.add("�̾���");
        c.add(1);
        
        // �жϼ������Ƿ��ж��̾���
        boolean flag = c.contains("�̾���");
        boolean flag2 = c.contains("�̾���2");
        System.out.println(flag);
        System.out.println(flag2);
        System.out.println(c.contains(1));
        System.out.println("������Ԫ�ظ�����" + c.size());
        
        // ɾ��������ĳһ��Ԫ��
        c.remove(1);
        System.out.println("������Ԫ�ظ�����" + c.size());

        // �жϼ��ϵ�Ԫ���Ƿ�Ϊ��
        System.out.println(c.isEmpty());  // false
        c.clear();
        System.out.println(c.isEmpty());  // true
        System.out.println("=================================");
        c.add("abc");
        c.add("def");
        c.add(100);  // �Զ�װ�䡣
        c.add("Hello World");
        c.add(new Student());
        
        // װ����Object����
        Object[] obj = c.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

    }
}
