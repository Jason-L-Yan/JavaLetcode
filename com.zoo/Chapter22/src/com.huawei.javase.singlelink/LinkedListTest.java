import java.util.LinkedList;
import java.util.List;
/*
������ŵ㣺
    ���������ϵ�Ԫ���ڿռ�洢���ڴ��ַ��������
    ���������ɾԪ�ص�ʱ�򲻻��д���Ԫ��λ�ƣ���������ɾЧ�ʽϸߡ�
    ���Ժ�Ŀ����У�������������ɾ������Ԫ�ص�ҵ��Ƚ϶�ʱ������
    ʹ��LinkedList��

�����ȱ�㣺
    ����ͨ����ѧ���ʽ���㱻����Ԫ�ص��ڴ��ַ��ÿһ�β��Ҷ��Ǵ�ͷ
    �ڵ㿪ʼ������ֱ���ҵ�Ϊֹ������LinkedList���ϼ���/���ҵ�Ч��
    �ϵ͡�

    ArrayList���Ѽ������ӵ����¡���ĩβ���Ԫ��Ч�ʻ��Ǻܸߵġ���
    LinkedList���������ɾ���ӵ����¡�
    ��Ԫ�ض�����ĩβ��ӣ�����ArrayList�õı�LinkedList�ࡣ
 */
public class LinkedListTest {
    public static void main(String[] args) {
        // LinkedList���ϵײ�Ҳ�����±�ġ�
        // ע�⣺ArrayList֮���Լ���Ч�ʱȽϸߣ����ǵ�����Ϊ�±��ԭ������Ϊ�ײ����鷢�ӵ����á�
        // LinkedList�����������±꣬���Ǽ���/����ĳ��Ԫ�ص�ʱ��Ч�ʱȽϵͣ���Ϊֻ�ܴ�ͷ�ڵ㿪ʼһ��һ��������
        List list = new LinkedList();
        // ������Щ����������Ķ��ǽӿڱ�̡�
        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0;i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }

        // LinkedList�����г�ʼ��������û�С�
        // ������������û���κ�Ԫ�ء�first��last���ö���null��
        // ������LinkedList����ArrayList���Ժ�д����ʱ����Ҫ���ľ������ĸ����ϡ�
        // ��Ϊ����Ҫ����ӿڱ�̣����õķ������ǽӿ��еķ�����
        //List list2 = new ArrayList(); // ����д��ʾ�ײ����������顣
        List list2 = new LinkedList(); // ����д��ʾ�ײ�������˫������

        // ������Щ����������Ķ��ǽӿڱ�̡�
        list2.add("123");
        list2.add("456");
        list2.add("789");

        for(int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i));
        }

    }
}
