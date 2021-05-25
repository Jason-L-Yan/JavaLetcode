import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
测试List接口中常用方法
    1、List集合存储元素特点：有序可重复
        有序：List集合中的元素有下标。
        从0开始，以1递增。
        可重复：存储一个1，还可以再存储1.
    2、List既然是Collection接口的子接口，那么肯定List接口有自己“特色”的方法：
        以下只列出List接口特有的常用的方法：
            void add(int index, Object element)
            Object set(int index, Object element)
            Object get(int index)
            int indexOf(Object o)
            int lastIndexOf(Object o)
            Object remove(int index)

        以上几个方法不需要死记硬背，可以自己编写代码测试一下，理解一下，
        以后开发的时候，还是要翻阅帮助文档。
 */
public class ListTest1 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("A");  // 默认都是向集合末尾添加元素。效率高
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("D");

        System.out.println("==========调用独有的方法add============");
        // 在列表的指定位置插入指定元素（第一个参数是下标）
        // 这个方法使用不多，因为对于ArrayList集合来说效率比较低。
        list.add(2, "King");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
        System.out.println("==========调用独有的方法get============");
        // 根据下标获取元素
        Object firstObj = list.get(0);
        System.out.println(firstObj);
        System.out.println("==========调用独有的方法get============");
        // 因为有下标，所以List集合有自己比较特殊的遍历方式
        // 通过下标遍历。【List集合特有的方式，Set没有。】,因为 Set 是无序的
        for(int i = 0; i < list.size(); i++){
            Object obj = list.get(i);
            System.out.println(obj);
        }
        
        System.out.println("==========调用独有的方法indexOf============");
        // 获取指定对象第一次出现处的索引。
        System.out.println(list.indexOf("C")); // 3
        
        System.out.println("==========调用独有的方法lastIndexO============");
        // 获取指定对象最后一次出现处的索引。
        System.out.println(list.lastIndexOf("C")); // 4
        
        System.out.println("==========调用独有的方法remove============");
        // 删除指定下标位置的元素
        // 删除下标为0的元素
        list.remove(0);
        System.out.println(list.size()); // 5
        
        System.out.println("==========调用独有的方法set============");

        // 修改指定位置的元素
        list.set(2, "Soft");

        // 遍历集合
        for(int i = 0; i < list.size(); i++){
            Object obj = list.get(i);
            System.out.println(obj);
        }
    }
}
