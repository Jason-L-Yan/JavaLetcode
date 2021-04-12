package JavaLearning;
// 方法计算阶乘
public class Homework8 {
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        System.out.println(jieCheng(n));

    }

    public static int jieCheng(int n){
        int result = 1;
        for(int i = n; i >= 1; i--){
            result = result * i;
        }
        return result;
    }

    
}
