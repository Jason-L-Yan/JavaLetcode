package Chapter20.com.huawei.javaSE.enum2;

public class SwitchTest {
    public static void main(String[] args) {
        // switch���֧��ö������
        // switchҲ֧��String��int
        // �Ͱ汾��JDK��ֻ֧��int
        // �߰汾��JDK��֧��int��String��ö�١�
        // byte short charҲ���ԣ���Ϊ�����Զ�����ת����
        switch (Season.WINTER) {
            // ����ʡ��Season.
            case SPRING:
                System.out.println("����");
                break;
            case SUMMER:
                System.out.println("����");
                break;
            case AUTUMN:
                System.out.println("����");
                break;
            case WINTER:
                System.out.println("����");
                break;
        }
    }
}
