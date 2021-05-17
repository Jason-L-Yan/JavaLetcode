/*
这个案例没有使用java中的枚举，分析以下程序，在设计方面有什么缺陷？
    以下代码可以编译，也可以运行。这些都没有问题。
    就是设计上你觉得有什么缺陷？

 */
package Chapter20.com.huawei.javaSE.enum2;

public class enumTest {
    public static void main(String[] args) {
        int a = divide(10, 2);
        System.out.println(a);
        
        int a2 = divide(10, 0);
        System.out.println(a2);
    }

    /**
     * 需求（这是设计者说的！）：以下程序，计算两个int类型数据的商，计算成功返回1，计算失败返回0
     * @param a int类型的数据
     * @param b int类型的数据
     * @return 返回1表示成功，返回0表示失败！
     */
    public static int divide(int a, int b) {
        try {
            int c = a / b;
            // 程序执行到此处表示以上代码没有发生异常。表示执行成功！
            return 1;
        } catch (Exception e){
            // 程序执行到此处表示以上程序出现了异常！
            // 表示执行失败!
            // System.out.println("出错原因：" + e);
            return 0;
        }
    }
}
