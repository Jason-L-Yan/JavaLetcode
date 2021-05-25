import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args) {
        // 1. 构造器为空
        List myList = new ArrayList();
        // 2. 构造器初始化容量
        // 初始化容量
        List myList2 = new ArrayList(100);

        // 3. 构造器转换集合
        // 创建一个HashSet集合
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);
        
        // 输出数组
        // 方式一：
        System.out.println("==========方式一===========");
        List myList3 = new ArrayList(c);
        for (int i = 0; i < myList3.size(); i++){
            System.out.println(myList3.get(i));
        }
        // 方式二：
        System.out.println("==========方式二===========");
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }

    }
}
