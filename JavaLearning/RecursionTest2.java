package JavaLearning;

public class RecursionTest2 {
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        System.out.println(jieCheng(n));
        s.close();

    }


    // 阶乘
    public static int jieCheng(int n){

        if(n == 1){
            return 1;
        }

        return n * jieCheng(n - 1);

    }
    
}
