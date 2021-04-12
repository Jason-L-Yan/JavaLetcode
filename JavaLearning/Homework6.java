package JavaLearning;

public class Homework6 {
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        
        for(int i = 0; i < n; i ++){
            for(int j = (n - 2 - i) ; j >= 0; j--){
                System.out.print(" ");
            }
            for(int z = 0; z < (i * 2 + 1) ; z++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i < n  ; i ++){

            for(int z = 0 ; z < i ; z++){
                System.out.print(" ");
            }
            for(int j = 2 * (n - 1 - i) ; j >= 0; j--){
                    
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
