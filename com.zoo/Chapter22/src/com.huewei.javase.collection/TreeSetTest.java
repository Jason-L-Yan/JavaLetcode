import java.util.Set;
import java.util.TreeSet;

/*
TreeSet���ϴ洢Ԫ���ص㣺
    1�����򲻿��ظ��ģ����Ǵ洢��Ԫ�ؿ����Զ����մ�С˳������
    ��Ϊ�������򼯺ϡ�

    2���������������ָ���Ǵ��ȥ��˳���ȡ������˳��ͬ������û���±ꡣ
 */
public class TreeSetTest {
    public static void main(String[] args) {
        // �������϶���
        Set<String> strs = new TreeSet<>();
        // ���Ԫ��
        strs.add("A");
        strs.add("B");
        strs.add("Z");
        strs.add("Y");
        strs.add("Z");
        strs.add("K");
        strs.add("M");
        // ����
        // ��С�����Զ�����
        for (String data : strs) {
            System.out.println(data);
        }

    }
}
