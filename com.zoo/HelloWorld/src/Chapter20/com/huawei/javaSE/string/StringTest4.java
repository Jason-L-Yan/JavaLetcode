/**
 * ����String���еĹ��췽����
 *  ��һ����String s = new String("");
 *  �ڶ�����String s = ""; ���
 *  ��������String s = new String(char����);
 *  ���ĸ���String s = new String(char����,��ʼ�±�,����);
 *  �������String s = new String(byte����);
 *  ��������String s = new String(byte����,��ʼ�±�,����)
 */

package Chapter20.com.huawei.javaSE.string;

public class StringTest4 {
    public static void main(String[] args) {

        // �����ַ���������õ�һ�ַ�ʽ
        String s1 = "hello world!";
        // s1��������б������һ���ڴ��ַ��
        // ��˵����Ӧ�����һ����ַ��
        // �������һ���ַ�����˵��String���Ѿ���д��toString()������
        System.out.println(s1);// hello world!
        System.out.println(s1.toString()); // hello world!

        // ����ֻ���ճ��õĹ��췽����
        byte[] bytes = { 97, 98, 99 }; // 97��a��98��b��99��c
        String s2 = new String(bytes);

        // ǰ��˵�������һ�����õ�ʱ�򣬻��Զ�����toString()������Ĭ��Object�Ļ������Զ����������ڴ��ַ��
        // ͨ�����������ǵó�һ�����ۣ�String���Ѿ���д��toString()������
        // ����ַ�������Ļ�������Ĳ��Ƕ�����ڴ��ַ�������ַ�������
        System.out.println(s2.toString()); // abc
        System.out.println(s2); // abc

        // String(�ֽ�����,����Ԫ���±����ʼλ��,����)
        // ��byte�����е�һ����ת�����ַ�����
        String s3 = new String(bytes, 1, 2);
        System.out.println(s3); // bc

        // ��char����ȫ��ת�����ַ���
        char[] chars = { '��', '��', '��', '��', '��' };
        String s4 = new String(chars);
        System.out.print("charתstring���飺");
        System.out.println(s4);
        // ��char�����һ����ת�����ַ���
        String s5 = new String(chars, 2, 3);
        System.out.println(s5);
        // ���ַ���ȫ��ת����char����
        char[] chars2= s4.toCharArray();
        System.out.print("Stringתchar���飺");
        for (int i = 0; i < chars2.length; i++) {
            System.out.print(chars2[i] + " ");
        }
        System.out.println();
        

        String s6 = new String("helloworld!");
        System.out.println(s6); // helloworld!
    }
}
