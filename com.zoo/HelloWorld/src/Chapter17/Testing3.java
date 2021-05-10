import java.util.Scanner;

public class Testing3 {
    public static void main(String[] args) {
        Testing tet = new Testing();
        System.setProperty("file.encoding","GBK");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0; i < 10; i++){
            System.out.println("²âÊÔ£º" + str);

        }
        sc.close();
    }
}
