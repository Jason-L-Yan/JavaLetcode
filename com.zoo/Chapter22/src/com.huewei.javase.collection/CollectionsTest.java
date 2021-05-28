import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
java.util.Collection ���Ͻӿ�
java.util.Collections ���Ϲ����࣬���㼯�ϵĲ�����
 */
public class CollectionsTest {
    public static void main(String[] args) {
        // ArrayList���ϲ����̰߳�ȫ�ġ�
        List<String> list = new ArrayList<>();

        // ����̰߳�ȫ��
        Collections.synchronizedList(list);

        // ����
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
        // ע�⣺��List������Ԫ��������Ҫ��֤List�����е�Ԫ��ʵ���ˣ�Comparable�ӿڡ�
        Collections.sort(wuGuis);
        for (WuGui2 wu : wuGuis) {
            System.out.println(wu);
        }
        
        System.out.println("===============================");
        // ��Set������ô�����أ�
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("kingsoft");
        set.add("king2");
        set.add("king1");
        // <T> void java.util.Collections.sort(List<T> list)
        // Collections.sort(); �÷���Ҫ��sort�е�Ԫ�ر�����List����
        // ��Set����ת����List����
        List<String> myList = new ArrayList<>(set); 
        Collections.sort(myList);
        for (String s : myList) {
            System.out.println(s);
        } 
        
        System.out.println("===============================");
        // ���ַ�ʽҲ��������
        // void java.util.Collections.sort(List<T> list, Comparator<? super T> c)
        //Collections.sort(list����, �Ƚ�������);
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
        return "С�ڹ�2 [age=" + age + "]";
    }

}