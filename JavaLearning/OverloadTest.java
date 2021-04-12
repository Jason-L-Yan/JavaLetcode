package JavaLearning;
// 方法重载
public class OverloadTest {
    public static void main(String[] args){
        System.out.println(sum(10, 20));
        System.out.println(sum(10L, 20L));
        System.out.println(sum(10.0, 20.0));

    }

    public static int sum(int a, int b){
        System.out.println("int求和");
        return a + b;
    }
    public static long sum(long a, long b){
        System.out.println("long求和");
        return a + b;
        
    }
    public static double sum(double a, double b){
        System.out.println("double求和");
        return a + b;

    }
    
}
