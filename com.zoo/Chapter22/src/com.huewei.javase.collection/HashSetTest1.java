import java.util.HashSet;
import java.util.Set;

/*
HashSet���ϣ�
    ���򲻿��ظ���
 */
public class HashSetTest1 {
    public static void main(String[] args) {
        Set<String> strs = new HashSet<>();

        // ���Ԫ��
        strs.add("����");
        strs.add("����");
        strs.add("ҫ��");
        strs.add("����");
        strs.add("����");
        strs.add("����");

        // ����
        /*
        ����
        ����
        ҫ��
        ����
        ����
        ����
        1���洢ʱ˳���ȡ����˳��ͬ��
        2�������ظ���
        3���ŵ�HashSet�����е�Ԫ��ʵ�����Ƿŵ�HashMap���ϵ�key�����ˡ�
         */

        for (String data : strs) {
            System.out.println(data);
        }
    }
}
