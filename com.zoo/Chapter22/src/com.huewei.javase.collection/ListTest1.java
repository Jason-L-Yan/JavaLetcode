import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
����List�ӿ��г��÷���
    1��List���ϴ洢Ԫ���ص㣺������ظ�
        ����List�����е�Ԫ�����±ꡣ
        ��0��ʼ����1������
        ���ظ����洢һ��1���������ٴ洢1.
    2��List��Ȼ��Collection�ӿڵ��ӽӿڣ���ô�϶�List�ӿ����Լ�����ɫ���ķ�����
        ����ֻ�г�List�ӿ����еĳ��õķ�����
            void add(int index, Object element)
            Object set(int index, Object element)
            Object get(int index)
            int indexOf(Object o)
            int lastIndexOf(Object o)
            Object remove(int index)

        ���ϼ�����������Ҫ����Ӳ���������Լ���д�������һ�£����һ�£�
        �Ժ󿪷���ʱ�򣬻���Ҫ���İ����ĵ���
 */
public class ListTest1 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("A");  // Ĭ�϶����򼯺�ĩβ���Ԫ�ء�Ч�ʸ�
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("D");

        System.out.println("==========���ö��еķ���add============");
        // ���б��ָ��λ�ò���ָ��Ԫ�أ���һ���������±꣩
        // �������ʹ�ò��࣬��Ϊ����ArrayList������˵Ч�ʱȽϵ͡�
        list.add(2, "King");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
        System.out.println("==========���ö��еķ���get============");
        // �����±��ȡԪ��
        Object firstObj = list.get(0);
        System.out.println(firstObj);
        System.out.println("==========���ö��еķ���get============");
        // ��Ϊ���±꣬����List�������Լ��Ƚ�����ı�����ʽ
        // ͨ���±��������List�������еķ�ʽ��Setû�С���,��Ϊ Set �������
        for(int i = 0; i < list.size(); i++){
            Object obj = list.get(i);
            System.out.println(obj);
        }
        
        System.out.println("==========���ö��еķ���indexOf============");
        // ��ȡָ�������һ�γ��ִ���������
        System.out.println(list.indexOf("C")); // 3
        
        System.out.println("==========���ö��еķ���lastIndexO============");
        // ��ȡָ���������һ�γ��ִ���������
        System.out.println(list.lastIndexOf("C")); // 4
        
        System.out.println("==========���ö��еķ���remove============");
        // ɾ��ָ���±�λ�õ�Ԫ��
        // ɾ���±�Ϊ0��Ԫ��
        list.remove(0);
        System.out.println(list.size()); // 5
        
        System.out.println("==========���ö��еķ���set============");

        // �޸�ָ��λ�õ�Ԫ��
        list.set(2, "Soft");

        // ��������
        for(int i = 0; i < list.size(); i++){
            Object obj = list.get(i);
            System.out.println(obj);
        }
    }
}
