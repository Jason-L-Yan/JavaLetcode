import java.util.ArrayList;
import java.util.Collection;
/*
测试contains方法
测试remove方法。
结论：存放在一个集合中的类型，一定要重写equals方法。
 */
public class CollectionTest5 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList();
        // 创建用户对象
        User u1 = new User("jack");
        // 加入集合
        c.add(u1);

        // 判断集合中是否包含u2
        User u2 = new User("jack");
        // 没有重写equals之前，使用的是Object中的equals方法（比较两者的地址）：这个结果是false
        // System.out.println(c.contains(u2)); // false
        // 重写equals方法之后，比较的时候会比较name。
        System.out.println(c.contains(u2)); // true
        System.out.println(c.size()); 
        // 删除元素
        c.remove(u2);
        System.out.println(c.size()); // 0

        // Integer 中的equals方法已重写。
        Integer x = new Integer(10000);
        c.add(x);

        Integer y = new Integer(10000);
        System.out.println(c.contains(y)); // true

        // 创建集合对象
        Collection cc = new ArrayList();
        // 创建字符串对象
        String s1 = new String("hello");
        // 加进去。
        cc.add(s1);

        // 创建了一个新的字符串对象
        String s2 = new String("hello");
        // 删除s2
        cc.remove(s2);  // s1.equals(s2) java认为s1和s2是一样的。删除s2就是删除s1。
        // 集合中元素个数是？
        System.out.println(cc.size()); // 0

        
    }
}

class User {
    private String name;
    public User(){}
    public User(String name){
        this.name = name;
    }

    // 重写equals方法
    // 将来调用equals方法的时候，一定是调用这个重写的equals方法。
    // 这个equals方法的比较原理是：只要姓名一样就表示同一个用户。
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof User)) {
            return false;
        }

        if (obj == this) return true;
        User user = (User) obj;
        // 如果名字一样表示同一个人。（不再比较对象的内存地址了。比较内容。）
        return this.name.equals(user.name);
    }

    
}