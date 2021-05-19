import java.util.ArrayList;
import java.util.Collection;

/*
关于java.util.Collection接口中常用的方法。
    1、Collection中能存放什么元素？
        没有使用“泛型”之前，Collection中可以存储Object的所有子类型。
        使用了“泛型”之后，Collection中只能存储某个具体的类型。
        集合后期我们会学习“泛型”语法。目前先不用管。Collection中什么都能存，
        只要是Object的子类型就行。（集合中不能直接存储基本数据类型，也不能存
        java对象，只是存储java对象的内存地址。）
    2、Collection中的常用方法
        boolean add(Object e) 向集合中添加元素
        int size()  获取集合中元素的个数
        void clear() 清空集合
        boolean contains(Object o) 判断当前集合中是否包含元素o，包含返回true，不包含返回false
        boolean remove(Object o) 删除集合中的某个元素。
        boolean isEmpty()  判断该集合中元素的个数是否为0
        Object[] toArray()  调用这个方法可以把集合转换成数组。【作为了解，使用不多。】
 */
public class CollectionTest {
    public static void main(String[] args) {
        // 创建一个集合对象。
        // Collection c = new Collection();   // 接口是抽象的，无法实例化。
        Collection c = new ArrayList();
        // 测试Collection接口中的常用方法
        c.add(1200);  // 自动装箱(java5的新特性。),实际上是放进去了一个对象的内存地址。Integer x = new Integer(1200);
        c.add(3.14);  // 自动装箱(java5的新特性。)
        c.add(new Object());
        c.add(new Student());
        c.add(true);  // 自动装箱(java5的新特性。)

        // 获取集合中元素个数
        System.out.println("集合中元素个数：" + c.size());
        
        // 清空集合
        c.clear();
        System.out.println("集合中元素个数：" + c.size());
        // 再向集合中添加元素
        c.add("Hello");
        c.add("World");
        c.add("浩克");
        c.add("绿巨人");
        c.add(1);
        
        // 判断集合中是否判断绿巨人
        boolean flag = c.contains("绿巨人");
        boolean flag2 = c.contains("绿巨人2");
        System.out.println(flag);
        System.out.println(flag2);
        System.out.println(c.contains(1));
        System.out.println("集合中元素个数：" + c.size());
        
        // 删除集合中某一个元素
        c.remove(1);
        System.out.println("集合中元素个数：" + c.size());

        // 判断集合的元素是否为空
        System.out.println(c.isEmpty());  // false
        c.clear();
        System.out.println(c.isEmpty());  // true
        System.out.println("=================================");
        c.add("abc");
        c.add("def");
        c.add(100);  // 自动装箱。
        c.add("Hello World");
        c.add(new Student());
        
        // 装换成Object数组
        Object[] obj = c.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

    }
}
