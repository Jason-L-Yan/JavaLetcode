/*
�ܽ�һ��֮ǰ��ѧ�ľ����쳣��
    ��ָ���쳣��NullPointerException
    ����ת���쳣��ClassCastException
    �����±�Խ���쳣��ArrayIndexOutOfBoundsException
    ���ָ�ʽ���쳣��NumberFormatException

Integer�൱������Щ���õķ����أ�
 */
package Chapter20.com.huawei.javaSE.integer;

public class IntegerTest7 {
    public static void main(String[] args) {
        // �ֶ�װ��
        Integer x = new Integer(1000);
        
        // �ֶ�����
        int y = x.intValue();
        System.out.println(y);
        
        Integer t = new Integer("123");  // �˴��ַ�������������,���򣬱��벻�������б���NumberFormatException

        // �ص㷽��
        // static int parseInt(String s)
        // ��̬����(��������)������String������int
        int retValue = Integer.parseInt("123"); // String -ת��-> int
        // int retValue = Integer.parseInt("����"); // NumberFormatException
        System.out.println(retValue + 100);
        
        // �պ�«��ư
        double retValue2 = Double.parseDouble("3.14");
        System.out.println(retValue2 + 1);

        float retValue3 = Float.parseFloat("1.0");
        System.out.println(retValue3 + 1);

        // -----------------------------------����������Ϊ�˽⣬����Ҫ����---------------------------------------
        // static String toBinaryString(int i)
        // ��̬�ģ���ʮ����ת���ɶ������ַ�����
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString); //"11" �������ַ���

        // static String toHexString(int i)
        // ��̬�ģ���ʮ����ת����ʮ�������ַ�����
        String hexString = Integer.toHexString(16);
        System.out.println(hexString); // "10"

        // ʮ�����ƣ�1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a
        hexString = Integer.toHexString(17);
        System.out.println(hexString); // "11"

        //static String toOctalString(int i)
        // ��̬�ģ���ʮ����ת���ɰ˽����ַ�����
        String octalString = Integer.toOctalString(8);
        System.out.println(octalString); // "10"

        System.out.println(new Object()); //java.lang.Object@6e8cf4c6

        // valueOf������Ϊ�˽�
        //static Integer valueOf(int i)
        // ��̬�ģ�int-->Integer
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        // static Integer valueOf(String s)
        // ��̬�ģ�String-->Integer
        Integer i2 = Integer.valueOf("100");
        System.out.println(i2);

    }
}