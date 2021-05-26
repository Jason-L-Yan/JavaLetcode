/*
HashMap���ϣ�
    1��HashMap���ϵײ��ǹ�ϣ��/ɢ�б�����ݽṹ��
    2����ϣ����һ�����������ݽṹ�أ�
        ��ϣ����һ������͵�������Ľ���塣
        ���飺�ڲ�ѯ����Ч�ʺܸߣ������ɾ����Ч�ʺܵ͡�
        ���������������ɾ����Ч�ʽϸߣ��ڲ�ѯ����Ч�ʺܵ͡�
        ��ϣ�����ϵ��������ݽṹ�ں���һ�𣬳�ַ������Ǹ��Ե��ŵ㡣
    3��HashMap���ϵײ��Դ���룺
        public class HashMap{
            // HashMap�ײ�ʵ���Ͼ���һ�����顣��һά���飩
            Node<K,V>[] table;
            // ��̬���ڲ���HashMap.Node
            static class Node<K,V> {
                final int hash; // ��ϣֵ����ϣֵ��key��hashCode()������ִ�н����hashֵͨ����ϣ����/�㷨������ת���洢��������±ꡣ��
                final K key; // �洢��Map�����е��Ǹ�key
                V value; // �洢��Map�����е��Ǹ�value
                Node<K,V> next; // ��һ���ڵ���ڴ��ַ��
            }
        }
        ��ϣ��/ɢ�б�һά���飬���������ÿһ��Ԫ����һ���������������������Ľ���塣��
    4������Ҫ���յ��ǣ�
        map.put(k,v)
        v = map.get(k)
        ����������������ʵ��ԭ���Ǳ������յġ�
    5��HashMap���ϵ�key�����ص㣺
        ���򣬲����ظ���
        Ϊʲô���� ��Ϊ��һ���ҵ��ĸ����������ϡ�
        �����ظ�����ô��֤�ģ� equals��������֤HashMap���ϵ�key�����ظ���
        ���key�ظ��ˣ�value�Ḳ�ǡ�

        ����HashMap����key���ֵ�Ԫ����ʵ���Ƿŵ�HashSet�������ˡ�
        ����HashSet�����е�Ԫ��Ҳ��Ҫͬʱ��дhashCode()+equals()������

    6����ϣ��HashMapʹ�ò���ʱ�޷��������ܣ�
        ���轫���е�hashCode()��������ֵ�̶�Ϊĳ��ֵ����ô�ᵼ�µײ��ϣ������
        ��������������������ǳ�Ϊ��ɢ�зֲ������ȡ�
        ʲô��ɢ�зֲ����ȣ�
            ������100��Ԫ�أ�10������������ôÿ��������������10���ڵ㣬������õģ�
            ��ɢ�зֲ����ȵġ�
        ���轫���е�hashCode()��������ֵ���趨Ϊ��һ����ֵ����������ʲô���⣿
            ���У���Ϊ�����Ļ����µײ��ϣ��ͳ�Ϊһά�����ˣ�û������ĸ����ˡ�
            Ҳ��ɢ�зֲ������ȡ�
        ɢ�зֲ�������Ҫ����дhashCode()����ʱ��һ���ļ��ɡ�
    7���ص㣺����HashMap����key���ֵ�Ԫ�أ��Լ�����HashSet�����е�Ԫ�أ���Ҫͬʱ��дhashCode��equals������
    8��HashMap���ϵ�Ĭ�ϳ�ʼ��������16��Ĭ�ϼ���������0.75
        ���Ĭ�ϼ��������ǵ�HashMap���ϵײ�����������ﵽ75%��ʱ�����鿪ʼ���ݡ�

        �ص㣬��ס��HashMap���ϳ�ʼ������������2�ı�������Ҳ�ǹٷ��Ƽ��ģ�
        ������Ϊ�ﵽɢ�о��ȣ�Ϊ�����HashMap���ϵĴ�ȡЧ�ʣ�������ġ�
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        // ����HashMap����key���ֵ�Ԫ���ص�
        // Integer��key������hashCode��equals����д�ˡ�
        Map<Integer, String> map = new HashMap<>();
        map.put(1111, "zhangsan");
        map.put(6666, "lisi");
        map.put(7777, "wangwu");
        map.put(2222, "zhaoliu");
        map.put(2222, "king");  // key�ظ���ʱ��value���Զ����ǡ�

        System.out.println(map.size());  // 4
        System.out.println("============================================");
        // ���� Map ����
        Set<Map.Entry<Integer, String>> node = map.entrySet();
        for (Map.Entry<Integer, String> entry : node) {
            // ��֤�����HashMap����key����Ԫ�أ����򲻿��ظ���
            System.out.println("��" + entry.getKey() + "��ֵ�ǣ�" + entry.getValue());
        }
    }
}
