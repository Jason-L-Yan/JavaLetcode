import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
����ʹ��foreach
 */
public class ForEachTest2 {
    public static void main(String[] args) {
        
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");
        strList.add("Kitty");

        System.out.println("==============����ʹ�õ�������ʽ==================");
        // ����ʹ�õ�����
        Iterator<String> it = strList.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("==============����ʹ���±�ķ�ʽ==================");
        // ����ʹ���±�ķ�ʽ
        for (int i = 0; i < strList.size(); i++) {
            String str = strList.get(i);
            System.out.println(str);
        }

        System.out.println("==============����ʹ����ǿforѭ��==================");
        // ����ʹ����ǿforѭ��
        for (String data : strList) {
            System.out.println(data);
        }
        
        System.out.println("==============����ʹ����ǿforѭ��==================");
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        for (Integer data : list) {
            System.out.println(data);
        }
    }
}
