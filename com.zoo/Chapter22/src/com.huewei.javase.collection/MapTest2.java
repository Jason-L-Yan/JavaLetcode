import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历。【非常重要】
 */
public class MapTest2 {
    public static void main(String[] args) {

        // 第一种方式：获取所有的key，通过遍历key，来遍历value
        System.out.println("*******************第一种方式**************************");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(6, "wangwu");
        map.put(4, "zhaoliu");
        // 遍历Map集合
        // 获取所有的key，所有的key是一个Set集合
        Set<Integer> keys = map.keySet();
        // 遍历key，通过key获取value
        // 迭代器可以
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            // 取出一份key
            Integer ir = it.next();
            // get方法通过key获取值
            String value = map.get(ir);  
            System.out.println(ir + "=" + value);
        }
        
        System.out.println("======================================");
        // foreach
        for (Integer ir : keys) {
            // System.out.println(ir);
            String value = map.get(ir);  // get方法通过key获取值
            System.out.println(ir + "=" + value);
        }
        
        System.out.println("*******************第二种方式**************************");
        // 第二种方式：Set<Map.Entry<K,V>> entrySet()
        // 以上这个方法是把Map集合直接全部转换成Set集合。
        // Set集合中元素的类型是：Map.Entry
        Set<Map.Entry<Integer, String>> set= map.entrySet();
        // 遍历Set集合，每一次取出一个Node
        // 迭代器
        Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, String> node = it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }
        
        // foreach
        // 这种方式效率比较高，因为获取key和value都是直接从node对象中获取的属性值。
        // 这种方式比较适合于大数据量。
        System.out.println("======================================");
        for (Map.Entry<Integer, String> node : map.entrySet()) {
            System.out.println(node);
        }
    }
}
