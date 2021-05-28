import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
java.util.Collection 集合接口
java.util.Collections 集合工具类，方便集合的操作。
 */
public class CollectionsTest {
    public static void main(String[] args) {
        // ArrayList集合不是线程安全的。
        List<String> list = new ArrayList<>();

        // 变成线程安全的
        Collections.synchronizedList(list);

        // 排序
        list.add("abf");
        list.add("abx");
        list.add("abc");
        list.add("abe");

        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("===============================");
        List<WuGui2> wuGuis = new ArrayList<>();
        wuGuis.add(new WuGui2(1000));
        wuGuis.add(new WuGui2(8000));
        wuGuis.add(new WuGui2(3000));
        // 注意：对List集合中元素排序，需要保证List集合中的元素实现了：Comparable接口。
        Collections.sort(wuGuis);
        for (WuGui2 wu : wuGuis) {
            System.out.println(wu);
        }
        
        System.out.println("===============================");
        // 对Set集合怎么排序呢？
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("kingsoft");
        set.add("king2");
        set.add("king1");
        // <T> void java.util.Collections.sort(List<T> list)
        // Collections.sort(); 该方法要求sort中的元素必须是List集合
        // 将Set集合转换成List集合
        List<String> myList = new ArrayList<>(set); 
        Collections.sort(myList);
        for (String s : myList) {
            System.out.println(s);
        } 
        
        System.out.println("===============================");
        // 这种方式也可以排序。
        // void java.util.Collections.sort(List<T> list, Comparator<? super T> c)
        //Collections.sort(list集合, 比较器对象);
    }
}

class WuGui2 implements Comparable<WuGui2> {
    int age;

    public WuGui2(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(WuGui2 o) {

        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "小乌龟2 [age=" + age + "]";
    }

}