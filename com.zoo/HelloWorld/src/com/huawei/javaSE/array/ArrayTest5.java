/*
1��main��������ġ�String[] args����ʲô�ã�
    �������£�˭�������main������JVM��
    JVM����main������ʱ�򣬻��Զ���һ��String���������
 */

package com.huawei.javaSE.array;

public class ArrayTest5 {
    public static void main(String[] args) {
        // JVMĬ�ϴ��ݹ���������������ĳ��ȣ�Ĭ��0
        // ͨ�����Եó���args����null��
        System.out.println("JVM�����ݹ�����String������������������ĳ����ǣ�" + args.length);
        // �紴��һ������Ϊ0�����顣
        // String[] str = new String[0];
        // ��ͬ�ڣ�
        String[] str = {};
        printLength(str);
        
        // ������һ�д����ʾ�ĺ��壺������󴴽��ˣ�����������û���κ����ݡ�
        //String[] strs = new String[0];
        //String[] strs = {}; // ��̬��ʼ�����飬����û������
        //printLength(strs);

        // �������ʲôʱ���������ֵ�أ�
        // ��ʵ��������������û��ģ��û������ڿ���̨�������������������Զ��ᱻת��Ϊ��String[] args��
        // �����������г���java ArrayTest05 abc def xyz
        // ��ô���ʱ��JVM���Զ�����abc def xyz��ͨ���ո�ķ�ʽ���з��룬�������֮���Զ��ŵ���String[] args�����鵱�С�
        // ����main���������String[] args������Ҫ�����������û���������ġ�
        // ��abc def xyz ת�����ַ������飺{"abc","def","xyz"}
        // ��������
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void printLength(String[] args) {
        System.out.println(args.length);
    }
}
