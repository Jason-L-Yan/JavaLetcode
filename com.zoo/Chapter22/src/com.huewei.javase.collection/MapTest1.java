import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
java.util.Map�ӿ��г��õķ�����
    1��Map��Collectionû�м̳й�ϵ��
    2��Map������key��value�ķ�ʽ�洢���ݣ���ֵ��
        key��value���������������͡�
        key��value���Ǵ洢������ڴ��ַ��
        key�������ĵ�λ��value��key��һ������Ʒ��
    3��Map�ӿ��г��÷�����
        V put(K key, V value) ��Map��������Ӽ�ֵ��
        V get(Object key) ͨ��key��ȡvalue
        void clear()    ���Map����
        boolean containsKey(Object key) �ж�Map���Ƿ����ĳ��key
        boolean containsValue(Object value) �ж�Map���Ƿ����ĳ��value
        boolean isEmpty()   �ж�Map������Ԫ�ظ����Ƿ�Ϊ0
        V remove(Object key) ͨ��keyɾ����ֵ��
        int size() ��ȡMap�����м�ֵ�Եĸ�����
        Collection<V> values() ��ȡMap���������е�value������һ��Collection

        Set<K> keySet() ��ȡMap�������е�key�����еļ���һ��set���ϣ�

        Set<Map.Entry<K,V>> entrySet()
            ��Map����ת����Set����
            ����������һ��Map���ϣ�������ʾ��
                map1���϶���
                key             value
                ----------------------------
                1               zhangsan
                2               lisi
                3               wangwu
                4               zhaoliu

                Set set = map1.entrySet();
                set���϶���
                1=zhangsan ��ע�⣺Map����ͨ��entrySet()����ת���ɵ����Set���ϣ�Set������Ԫ�ص������� Map.Entry<K,V>��
                2=lisi     ��Map.Entry��Stringһ��������һ�����͵����֣�ֻ������Map.Entry�Ǿ�̬�ڲ��࣬��Map�еľ�̬�ڲ��ࡿ
                3=wangwu
                4=zhaoliu ---> ��������Ǹ�ʲô��Map.Entry
 */
public class MapTest1 {
    public static void main(String[] args) {
        // ����Map���϶���
        Map<Integer, String> map = new HashMap();
        // ��Map��������Ӽ�ֵ��
        map.put(1, "zhangsan"); // 1������������Զ�װ�䡣
        map.put(8, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");
        // ͨ��key��ȡvalue
        String str = map.get(8); // lisi
        System.out.println(str);
        // ��ȡ��ֵ�Ե�����
        System.out.println("��ֵ�Ե�����" + map.size());
        map.remove(8);
        System.out.println("��ֵ�Ե�����" + map.size());
        // �ж��Ƿ����ĳ��key
        // contains�����ײ���õĶ���equals���бȶԵģ������Զ����������Ҫ��дequals������
        System.out.println(map.containsKey(5)); // false
        System.out.println(map.containsKey(4)); // true
        // �ж��Ƿ����ĳ��value
        // contains�����ײ���õĶ���equals���бȶԵģ������Զ����������Ҫ��дequals������
        System.out.println(map.containsValue("zhaoliu")); // true
        // ��ȡ���е�value

        System.out.println(map.values()); // [zhangsan, wangwu, zhaoliu]
        Collection<String> values = map.values();
        // foreach
        for (String v : values) {
            System.out.println(v);
            // zhangsan
            // wangwu
            // zhaoliu
        }

        // ���map����
        map.clear();
        System.out.println("��ֵ�Ե�����" + map.size());
        // �ж��Ƿ�Ϊ��
        System.out.println(map.isEmpty());

    }
}
