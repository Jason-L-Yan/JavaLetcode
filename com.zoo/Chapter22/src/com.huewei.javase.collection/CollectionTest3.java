import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest3 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c1 = new ArrayList(); // ArrayList有序可重复

        // 添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);

        // 迭代集合
        Iterator it = c1.iterator(); // 前面Iterator是大写，是接口，后面iterator()小写，是方法。
        while (it.hasNext()) {
            // 存进去是什么数据类型，取出类还是什么数据类型。
            Object obj = it.next();
            if (obj instanceof Integer) {
                // 只不过在输出的时候会转换成字符串。因为这里println会调用toString()方法。控制台打印的就是字符串。
                System.out.println("Integer类型。");
            }

            System.out.println(obj);
        }

        // 无序不可重复。
        Collection c2 = new HashSet();
        // 添加元素
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(400);
        c2.add(100);
        // 迭代集合
        Iterator it2 = c2.iterator(); // 前面Iterator是大写，是接口，后面iterator()小写，是方法。
        while (it2.hasNext()) {
            // 存进去是什么数据类型，取出类还是什么数据类型。
            Object obj = it2.next();
            // if (obj instanceof Integer) {
            // // 只不过在输出的时候会转换成字符串。因为这里println会调用toString()方法。控制台打印的就是字符串。
            // System.out.println("in");
            // }

            System.out.println(obj);
        }

    }
}
