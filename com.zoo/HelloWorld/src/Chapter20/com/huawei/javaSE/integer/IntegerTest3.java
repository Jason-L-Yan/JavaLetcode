/*
����Integer��Ĺ��췽������������
    Integer(int)
    Integer(String)
 */

package Chapter20.com.huawei.javaSE.integer;

public class IntegerTest3 {
    public static void main(String[] args) {
        // Java9֮�󲻽���ʹ��������췽���ˡ����ֺ��߱�ʾ�ѹ�ʱ��
        // ������100ת����Integer��װ���ͣ�int --> Integer��
        Integer x = new Integer(100);
        System.out.println(x);

        // ��String���͵����֣�ת����Integer��װ���͡���String --> Integer��
        Integer y = new Integer("123");
        System.out.println(y);

        // double -->Double
        Double d = new Double(1.23);
        System.out.println(d);

        // String --> Double
        Double e = new Double("3.14");
        System.out.println(e);
    }
}
