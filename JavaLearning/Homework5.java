package JavaLearning;

// import java.lang.FdLibm.Pow;
// 求质数
public class Homework5 {
   
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt(); 
        boolean zhiShu = true;
        for(int i = 2; i <= (int)(n / 2) + 1; i++){
            if(n % i == 0){
                zhiShu = false;
                // System.out.println(n + "不是质数。");
                break;
            }
        }
        System.out.println(n + (zhiShu ? "是" : "不是") + "质数。");
    }  
}
