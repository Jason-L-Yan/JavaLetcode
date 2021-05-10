import java.util.Scanner;
import Chapter17.Testing;

public class Testing2 {
    // 生成构造器
    public Testing2() {
    }

    public static void main(String[] args) {
        System.setProperty("file.encoding", "GBK");
        Testing te = new Testing();
        System.out.println(te.sumTest(100));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("输出为：");
        for (int i = 0; i < 5; i++) {
            System.out.println(str);
        }
        sc.close();

    }

}