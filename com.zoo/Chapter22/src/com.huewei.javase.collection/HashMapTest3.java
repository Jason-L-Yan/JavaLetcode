import java.util.HashMap;
import java.util.Map;

/*
HashMap����key��������null��
    ����
    ����Ҫע�⣺HashMap���ϵ�key nullֵֻ����һ����
    �п������Ե�ʱ���������������⡣
 */
public class HashMapTest3 {
    public static void main(String[] args) {
        Map map = new HashMap();

        // HashMap��������keyΪnull
        map.put(null, null);
        System.out.println(map.size());
        
        // key�ظ��Ļ�value�Ǹ��ǣ�
        map.put(null, 100);
        System.out.println(map.size());

        // ͨ��key��ȡvalue
        System.out.println(map.get(null)); // 100
    }
}
