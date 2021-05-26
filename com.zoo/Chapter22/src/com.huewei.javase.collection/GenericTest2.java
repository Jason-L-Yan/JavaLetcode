import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK֮�������ˣ��Զ������ƶϻ��ơ����ֳ�Ϊ��ʯ���ʽ��
 */
public class GenericTest2 {
    public static void main(String[] args) {
        // ArrayList<��������ͻ��Զ��ƶ�>()��ǰ����JDK8֮�������
        // �Զ������ƶϣ���ʯ���ʽ��
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
        // ���Ͳ�ƥ��
        // strList.add(new Cat());
        strList.add("adcfsdfsdfsdf");
        strList.add("dfssdfsdfsdhfgh");
        strList.add("xtzgfgfdghfdgfdg");
        // ���Ͳ�ƥ�䡣
        //strList.add(123);
        // System.out.println(strList.size());
        Iterator<String> it2 = strList.iterator();
        while (it2.hasNext()) {
            // ���û��ʹ�÷���
            /*
            Object obj = it2.next();
            if(obj instanceof String){
                String ss = (String)obj;
                ss.substring(7);
            }
             */
            String str = it2.next();
            // ֱ�ӵ���String���substring������ȡ�ַ�����
            System.out.println(str.substring(7));
            
        }
    }
}
