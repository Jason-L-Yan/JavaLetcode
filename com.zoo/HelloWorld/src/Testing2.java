import java.util.Scanner;
import Chapter17.Testing;

public class Testing2 {
    // ���ɹ�����
    public Testing2() {
    }

    public static void main(String[] args) {
        System.setProperty("file.encoding", "GBK");
        Testing te = new Testing();
        System.out.println(te.sumTest(100));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("���Ϊ��");
        for (int i = 0; i < 5; i++) {
            System.out.println(str);
        }
        sc.close();

    }

}