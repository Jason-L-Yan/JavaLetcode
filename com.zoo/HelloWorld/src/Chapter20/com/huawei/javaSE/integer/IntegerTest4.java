package Chapter20.com.huawei.javaSE.integer;

public class IntegerTest4 {
    public static void main(String[] args) {
        // 通过访问包装类的常量，来获取最大值和最小值
        byte i = 99;  // 基本数值类型
        Byte b = new Byte(i);  // 引用数值类型
        System.out.println(b);
        System.out.println("int最大值：" + Integer.MAX_VALUE);
        System.out.println("int最小值：" + Integer.MIN_VALUE);
        System.out.println("byte最小值：" + Byte.MAX_VALUE);
        System.out.println("byte最小值：" + Byte.MIN_VALUE);
        // 以此类推，其他数值的最值。
    }
}
