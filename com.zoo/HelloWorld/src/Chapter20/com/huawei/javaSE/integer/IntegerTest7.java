/*
总结一下之前所学的经典异常？
    空指针异常：NullPointerException
    类型转换异常：ClassCastException
    数组下标越界异常：ArrayIndexOutOfBoundsException
    数字格式化异常：NumberFormatException

Integer类当中有哪些常用的方法呢？
 */
package Chapter20.com.huawei.javaSE.integer;

public class IntegerTest7 {
    public static void main(String[] args) {
        // 手动装箱
        Integer x = new Integer(1000);
        
        // 手动拆箱
        int y = x.intValue();
        System.out.println(y);
        
        Integer t = new Integer("123");  // 此处字符串必须是数字,否则，编译不报错，运行报错。NumberFormatException

        // 重点方法
        // static int parseInt(String s)
        // 静态方法(类名调用)，传参String，返回int
        int retValue = Integer.parseInt("123"); // String -转换-> int
        // int retValue = Integer.parseInt("中文"); // NumberFormatException
        System.out.println(retValue + 100);
        
        // 照葫芦画瓢
        double retValue2 = Double.parseDouble("3.14");
        System.out.println(retValue2 + 1);

        float retValue3 = Float.parseFloat("1.0");
        System.out.println(retValue3 + 1);

        // -----------------------------------以下内容作为了解，不需要掌握---------------------------------------
        // static String toBinaryString(int i)
        // 静态的：将十进制转换成二进制字符串。
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString); //"11" 二进制字符串

        // static String toHexString(int i)
        // 静态的：将十进制转换成十六进制字符串。
        String hexString = Integer.toHexString(16);
        System.out.println(hexString); // "10"

        // 十六进制：1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a
        hexString = Integer.toHexString(17);
        System.out.println(hexString); // "11"

        //static String toOctalString(int i)
        // 静态的：将十进制转换成八进制字符串。
        String octalString = Integer.toOctalString(8);
        System.out.println(octalString); // "10"

        System.out.println(new Object()); //java.lang.Object@6e8cf4c6

        // valueOf方法作为了解
        //static Integer valueOf(int i)
        // 静态的：int-->Integer
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        // static Integer valueOf(String s)
        // 静态的：String-->Integer
        Integer i2 = Integer.valueOf("100");
        System.out.println(i2);

    }
}