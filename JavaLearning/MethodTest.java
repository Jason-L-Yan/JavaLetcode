package JavaLearning;

public class MethodTest{
    public static void main(String[] args){
        int a = MethodTest.sumInt(5, 6);
        double b = MethodTest.divide(10, 2);  // 小容量到大容量会自动数据类型转换。
        System.out.println(a);
        System.out.println(b);
    }


    // 求和
    public static int sumInt(int i, int j){  // 定义int型，必须有int返回值。方法放在类中，在main()方法先后都没关系。

        return i + j;
    }


    // 相除
    public static int divide(int a, int b){
        return a / b;
    }


}