import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map���ϵı��������ǳ���Ҫ��
 */
public class MapTest2 {
    public static void main(String[] args) {

        // ��һ�ַ�ʽ����ȡ���е�key��ͨ������key��������value
        System.out.println("*******************��һ�ַ�ʽ**************************");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(6, "wangwu");
        map.put(4, "zhaoliu");
        // ����Map����
        // ��ȡ���е�key�����е�key��һ��Set����
        Set<Integer> keys = map.keySet();
        // ����key��ͨ��key��ȡvalue
        // ����������
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            // ȡ��һ��key
            Integer ir = it.next();
            // get����ͨ��key��ȡֵ
            String value = map.get(ir);  
            System.out.println(ir + "=" + value);
        }
        
        System.out.println("======================================");
        // foreach
        for (Integer ir : keys) {
            // System.out.println(ir);
            String value = map.get(ir);  // get����ͨ��key��ȡֵ
            System.out.println(ir + "=" + value);
        }
        
        System.out.println("*******************�ڶ��ַ�ʽ**************************");
        // �ڶ��ַ�ʽ��Set<Map.Entry<K,V>> entrySet()
        // ������������ǰ�Map����ֱ��ȫ��ת����Set���ϡ�
        // Set������Ԫ�ص������ǣ�Map.Entry
        Set<Map.Entry<Integer, String>> set= map.entrySet();
        // ����Set���ϣ�ÿһ��ȡ��һ��Node
        // ������
        Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, String> node = it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }
        
        // foreach
        // ���ַ�ʽЧ�ʱȽϸߣ���Ϊ��ȡkey��value����ֱ�Ӵ�node�����л�ȡ������ֵ��
        // ���ַ�ʽ�Ƚ��ʺ��ڴ���������
        System.out.println("======================================");
        for (Map.Entry<Integer, String> node : map.entrySet()) {
            System.out.println(node);
        }
    }
}
