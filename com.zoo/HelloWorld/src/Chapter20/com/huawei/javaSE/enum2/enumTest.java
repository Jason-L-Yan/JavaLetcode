/*
�������û��ʹ��java�е�ö�٣��������³�������Ʒ�����ʲôȱ�ݣ�
    ���´�����Ա��룬Ҳ�������С���Щ��û�����⡣
    ����������������ʲôȱ�ݣ�

 */
package Chapter20.com.huawei.javaSE.enum2;

public class enumTest {
    public static void main(String[] args) {
        int a = divide(10, 2);
        System.out.println(a);
        
        int a2 = divide(10, 0);
        System.out.println(a2);
    }

    /**
     * �������������˵�ģ��������³��򣬼�������int�������ݵ��̣�����ɹ�����1������ʧ�ܷ���0
     * @param a int���͵�����
     * @param b int���͵�����
     * @return ����1��ʾ�ɹ�������0��ʾʧ�ܣ�
     */
    public static int divide(int a, int b) {
        try {
            int c = a / b;
            // ����ִ�е��˴���ʾ���ϴ���û�з����쳣����ʾִ�гɹ���
            return 1;
        } catch (Exception e){
            // ����ִ�е��˴���ʾ���ϳ���������쳣��
            // ��ʾִ��ʧ��!
            // System.out.println("����ԭ��" + e);
            return 0;
        }
    }
}
