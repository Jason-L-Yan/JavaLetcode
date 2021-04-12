package JavaLearning;

public class Homework9 {
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        for(int i = n + 1; ; i++){
            if(zhiShu(i)){
                System.out.println(i);
                break;
            }
        }

    }


    // 判断是否为质数
    public static boolean zhiShu(int n){
           
        for(int j = 2; j <= (n/2 + 1); j++){
            if(n % j == 0){
                return false;
            }
        }
        return true;
        
    }
    
}


