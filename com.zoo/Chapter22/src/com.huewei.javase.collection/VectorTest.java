import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
/*
Vector：
    1、底层也是一个数组。
    2、初始化容量：10
    3、怎么扩容的？
        扩容之后是原容量的2倍。
        10--> 20 --> 40 --> 80

    4、ArrayList集合扩容特点：
        ArrayList集合扩容是原容量1.5倍。

    5、Vector中所有的方法都是线程同步的，都带有synchronized关键字，
    是线程安全的。效率比较低，使用较少了。

    6、怎么将一个线程不安全的ArrayList集合转换成线程安全的呢？
        使用集合工具类：
            java.util.Collections;

            java.util.Collection 是集合接口。
            java.util.Collections 是集合工具类。
 */
public class VectorTest {
    public static void main(String[] args) {
        // 创建一个Vector集合
        List vector = new Vector();
        // Vector vector = new Vector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        // 满了之后扩容（扩容之后的容量是20）
        vector.add(11);

        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }

        List myList = new ArrayList();
        Collections.synchronizedList(myList);
        myList.add("111");
        myList.add("222");
        myList.add("333");
    }
}
