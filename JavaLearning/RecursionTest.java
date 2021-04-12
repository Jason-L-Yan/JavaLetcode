package JavaLearning;

// 递归求 1到n 的和
public class RecursionTest {
    
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        System.out.println(RecurSum(n, 0));
        System.out.println(RecurSum2(n));
        s.close();
    }


    // 方法一：这种方法不够好。
    public static int RecurSum(int n, int sum){
        sum += n;
        if(n == 1){
            return sum;
        }
        
        return RecurSum(n - 1, sum);
    }
    
    
    // 方法二
    public static int RecurSum2(int n){
        if(n == 1){
            return 1;
        }
        return n + RecurSum2(n - 1);
    }

    
}
