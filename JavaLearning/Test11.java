package JavaLearning;

public class Test11 {
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        String str = s.next();
        int[] a = new int[10];
    
        
        for(int i = str.length() - 1; i >= 0; i--){
            // 利用 ASCII 码，字符 0 的十进制数是：48
            int n = str.charAt(i) - 48;
            if(a[n] == 0){
                System.out.print(n);
                a[n] = 1;
            }
        }
        s.close();
    }
    
}
