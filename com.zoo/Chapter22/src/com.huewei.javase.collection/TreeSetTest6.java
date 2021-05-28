import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet������Ԫ�ؿ�����ĵڶ��ַ�ʽ��ʹ�ñȽ����ķ�ʽ��
���յĽ��ۣ�
    �ŵ�TreeSet����TreeMap����key���ֵ�Ԫ��Ҫ����������,�������ַ�ʽ��
        ��һ�֣����ڼ����е�Ԫ��ʵ��java.lang.Comparable�ӿڡ�
        �ڶ��֣��ڹ���TreeSet����TreeMap���ϵ�ʱ�������һ���Ƚ�������
Comparable��Comparator��ôѡ���أ�
    ���ȽϹ��򲻻ᷢ���ı��ʱ�򣬻���˵���ȽϹ���ֻ��1����ʱ�򣬽���ʵ��Comparable�ӿڡ�
    ����ȽϹ����ж����������Ҫ����ȽϹ���֮��Ƶ���л�������ʹ��Comparator�ӿڡ�

    Comparator�ӿڵ���Ʒ���OCPԭ��
 */
public class TreeSetTest6 {
    public static void main(String[] args) {
        // ����TreeSet���ϵ�ʱ����Ҫʹ������Ƚ�����
        // TreeSet<WuGui> wuGuis = new TreeSet<>();//�������У�û��ͨ�����췽������һ���Ƚ�����ȥ��

        // ��һ��
        // �����췽������һ���Ƚ�����
        TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());
        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(800));
        wuGuis.add(new WuGui(850));
        
        for (WuGui wuGui : wuGuis) {
            System.out.println(wuGui);
        }
        
        System.out.println("==============================================");
        // �ڶ��֣������ڲ���ķ�ʽ�������û�����֡�ֱ��new�ӿڡ���
        TreeSet<WuGui> wuGuis2 = new TreeSet<>(new Comparator<WuGui>(){

            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o1.age - o2.age;
            }
            
        });

        wuGuis2.add(new WuGui(1000));
        wuGuis2.add(new WuGui(800));
        wuGuis2.add(new WuGui(850));
        
        for (WuGui wuGui2 : wuGuis2) {
            System.out.println(wuGui2);
        }

    }
}

// �ڹ�
class WuGui {
    int age;

    public WuGui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "С�ڹ� [age=" + age + "]";
    }
}

// �����������дһ���Ƚ���
// �Ƚ���ʵ��java.util.Comparator�ӿڡ���Comparable��java.lang���µġ�Comparator��java.util���µġ���
class WuGuiComparator implements Comparator<WuGui> {

    @Override
    public int compare(WuGui o1, WuGui o2) {
        // ָ���ȽϹ���
        return o1.age - o2.age;
    }

}
