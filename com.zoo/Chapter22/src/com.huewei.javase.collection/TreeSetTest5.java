import java.util.TreeSet;

/*
先按照年龄升序，如果年龄一样的再按照姓名升序。
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
    compareTo方法的返回值很重要：
        返回0表示相同，value会覆盖。
        返回>0，会继续在右子树上找。【10 - 9 = 1 ，1 > 0的说明左边这个数字比较大。所以在右子树上找。】
        返回<0，会继续在左子树上找。
     */
    @Override
    public int compareTo(Vip o) {

        // 年龄相同时按照名字排序。  
        // 姓名是String类型，可以直接比。调用compareTo来完成比较。
        if (this.age - o.age != 0) {
            // 年龄不一样
            return this.age - o.age;
        } else {
            return this.name.compareTo(o.name);
        }
        // 输出结果为：
        // Vip [age=17, name=soft]
        // Vip [age=18, name=king]
        // Vip [age=20, name=zhangsan]
        // Vip [age=20, name=zhangsi]
        
        // 把以上语句注释，仅仅比较年龄
        // return this.age - o.age;
        // 输出结果为：
        // Vip [age=17, name=soft]
        // Vip [age=18, name=king]
        // Vip [age=20, name=zhangsi]
    }

}
