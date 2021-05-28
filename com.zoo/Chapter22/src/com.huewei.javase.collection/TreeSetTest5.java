import java.util.TreeSet;

/*
�Ȱ������������������һ�����ٰ�����������
 */
public class TreeSetTest5 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<Vip>();
        vips.add(new Vip("zhangsi", 20));
        vips.add(new Vip("zhangsan", 20));
        vips.add(new Vip("king", 18));
        vips.add(new Vip("soft", 17));

        for (Vip vip : vips) {
            System.out.println(vip);
        }
    }
}

class Vip implements Comparable<Vip> {
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip [age=" + age + ", name=" + name + "]";
    }

     /*
    compareTo�����ķ���ֵ����Ҫ��
        ����0��ʾ��ͬ��value�Ḳ�ǡ�
        ����>0������������������ҡ���10 - 9 = 1 ��1 > 0��˵�����������ֱȽϴ����������������ҡ���
        ����<0������������������ҡ�
     */
    @Override
    public int compareTo(Vip o) {

        // ������ͬʱ������������  
        // ������String���ͣ�����ֱ�ӱȡ�����compareTo����ɱȽϡ�
        if (this.age - o.age != 0) {
            // ���䲻һ��
            return this.age - o.age;
        } else {
            return this.name.compareTo(o.name);
        }
        // ������Ϊ��
        // Vip [age=17, name=soft]
        // Vip [age=18, name=king]
        // Vip [age=20, name=zhangsan]
        // Vip [age=20, name=zhangsi]
        
        // ���������ע�ͣ������Ƚ�����
        // return this.age - o.age;
        // ������Ϊ��
        // Vip [age=17, name=soft]
        // Vip [age=18, name=king]
        // Vip [age=20, name=zhangsi]
    }

}
