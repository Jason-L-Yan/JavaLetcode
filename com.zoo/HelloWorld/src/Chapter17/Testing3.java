package Chapter17;

import java.util.Scanner;

public class Testing3 {
    public static void main(String[] args) {
        System.setProperty("file.encoding","GBK");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0; i < 10; i++){
            System.out.println("���ԣ�" + str);

        }
        sc.close();
    }
}
