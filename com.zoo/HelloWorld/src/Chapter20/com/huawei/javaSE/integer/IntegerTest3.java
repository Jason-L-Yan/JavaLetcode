/*
关于Integer类的构造方法，有两个：
    Integer(int)
    Integer(String)
 */

package Chapter20.com.huawei.javaSE.integer;

public class IntegerTest3 {
    public static void main(String[] args) {
        // Java9之后不建议使用这个构造方法了。出现横线表示已过时。
        // 将数字100转换成Integer包装类型（int --> Integer）
        Integer x = new Integer(100);
        System.out.println(x);

        // 将String类型的数字，转换成Integer包装类型。（String --> Integer）
        Integer y = new Integer("123");
        System.out.println(y);

        // double -->Double
        Double d = new Double(1.23);
        System.out.println(d);

        // String --> Double
        Double e = new Double("3.14");
        System.out.println(e);
    }
}
