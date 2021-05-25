import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args) {
        // 1. ������Ϊ��
        List myList = new ArrayList();
        // 2. ��������ʼ������
        // ��ʼ������
        List myList2 = new ArrayList(100);

        // 3. ������ת������
        // ����һ��HashSet����
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);
        
        // �������
        // ��ʽһ��
        System.out.println("==========��ʽһ===========");
        List myList3 = new ArrayList(c);
        for (int i = 0; i < myList3.size(); i++){
            System.out.println(myList3.get(i));
        }
        // ��ʽ����
        System.out.println("==========��ʽ��===========");
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }

    }
}
