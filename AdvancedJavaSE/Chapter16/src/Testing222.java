import java.util.Scanner;

public class Testing222 {
    public static void main(String[] args) {
        System.setProperty("file.encoding","GBK");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < 10; i++){
            System.out.println("¬����:" + str);

        }
        sc.close();
    }
}