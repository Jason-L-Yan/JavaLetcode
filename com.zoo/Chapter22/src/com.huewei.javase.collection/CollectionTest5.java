import java.util.ArrayList;
import java.util.Collection;
/*
����contains����
����remove������
���ۣ������һ�������е����ͣ�һ��Ҫ��дequals������
 */
public class CollectionTest5 {
    public static void main(String[] args) {
        // �������϶���
        Collection c = new ArrayList();
        // �����û�����
        User u1 = new User("jack");
        // ���뼯��
        c.add(u1);

        // �жϼ������Ƿ����u2
        User u2 = new User("jack");
        // û����дequals֮ǰ��ʹ�õ���Object�е�equals�������Ƚ����ߵĵ�ַ������������false
        // System.out.println(c.contains(u2)); // false
        // ��дequals����֮�󣬱Ƚϵ�ʱ���Ƚ�name��
        System.out.println(c.contains(u2)); // true
        System.out.println(c.size()); 
        // ɾ��Ԫ��
        c.remove(u2);
        System.out.println(c.size()); // 0

        // Integer �е�equals��������д��
        Integer x = new Integer(10000);
        c.add(x);

        Integer y = new Integer(10000);
        System.out.println(c.contains(y)); // true

        // �������϶���
        Collection cc = new ArrayList();
        // �����ַ�������
        String s1 = new String("hello");
        // �ӽ�ȥ��
        cc.add(s1);

        // ������һ���µ��ַ�������
        String s2 = new String("hello");
        // ɾ��s2
        cc.remove(s2);  // s1.equals(s2) java��Ϊs1��s2��һ���ġ�ɾ��s2����ɾ��s1��
        // ������Ԫ�ظ����ǣ�
        System.out.println(cc.size()); // 0

        
    }
}

class User {
    private String name;
    public User(){}
    public User(String name){
        this.name = name;
    }

    // ��дequals����
    // ��������equals������ʱ��һ���ǵ��������д��equals������
    // ���equals�����ıȽ�ԭ���ǣ�ֻҪ����һ���ͱ�ʾͬһ���û���
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof User)) {
            return false;
        }

        if (obj == this) return true;
        User user = (User) obj;
        // �������һ����ʾͬһ���ˡ������ٱȽ϶�����ڴ��ַ�ˡ��Ƚ����ݡ���
        return this.name.equals(user.name);
    }

    
}