import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK之后引入了：自动类型推断机制。（又称为钻石表达式）
 */
public class GenericTest2 {
    public static void main(String[] args) {
        // ArrayList<这里的类型会自动推断>()，前提是JDK8之后才允许。
        // 自动类型推断，钻石表达式！
        List<Animal> myList = new ArrayList<>();
        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());

        Iterator<Animal>it = myList.iterator();
        while (it.hasNext()) {
            Animal animal = it.next();
            animal.move();
        }

        List<String> strList = new ArrayList<>();
        // 类型不匹配
        // strList.add(new Cat());
        strList.add("adcfsdfsdfsdf");
        strList.add("dfssdfsdfsdhfgh");
        strList.add("xtzgfgfdghfdgfdg");
        // 类型不匹配。
        //strList.add(123);
        // System.out.println(strList.size());
        Iterator<String> it2 = strList.iterator();
        while (it2.hasNext()) {
            // 如果没有使用泛型
            /*
            Object obj = it2.next();
            if(obj instanceof String){
                String ss = (String)obj;
                ss.substring(7);
            }
             */
            String str = it2.next();
            // 直接调用String类的substring方法截取字符串。
            System.out.println(str.substring(7));
            
        }
    }
}
