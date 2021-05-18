package com.huawei.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
// import java.io.IOException;
/*
�����쳣�ĵ�һ�ַ�ʽ��
    �ڷ���������λ����ʹ��throws�ؼ����׳���˭����������������Ҿ��׸�˭���׸�������������
    ���ִ����쳣��̬�ȣ��ϱ���

�����쳣�ĵڶ��ַ�ʽ��
    ʹ��try..catch�����쳣���в�׽��
    ����쳣�����ϱ����Լ�������¶������ˡ�
    �쳣�׵��˴�Ϊֹ�����������ˡ�

ע�⣺
    ֻҪ�쳣û�в�׽�������ϱ��ķ�ʽ���˷����ĺ������벻��ִ�С�
    ������Ҫע�⣬try�����е�ĳһ�г����쳣�����к���Ĵ��벻��ִ�С�
    try..catch��׽�쳣֮�󣬺����������ִ�С�

���Ժ�Ŀ����У��������ʱ�쳣��Ӧ���ϱ����ǲ�׽�أ���ôѡ��
    ���ϣ��������������ѡ��throws�ϱ���
    �������ʹ�ò�׽�ķ�ʽ��
 */
public class ExceptionTest4 {

    // һ�㲻������main������ʹ��throws����Ϊ����쳣��������ķ����ˣ�һ�����׸�JVM��JVMֻ����ֹ��
    // �쳣������Ƶ����þ�����ǿ����Ľ�׳�ԡ���ô���������쳣������Ҳ��Ӱ������ִ�С�����
    // һ��main�����е��쳣����ʹ��try..catch���в�׽��main�Ͳ�Ҫ���������ˡ�
    /*
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }
     */
    public static void main(final String[] args) {
        System.out.println("main begin");
        try {
            m1();
            System.out.println("Hello World");
        } catch (FileNotFoundException e) {  // catch����ĺ���һ���������βΡ�
            // �����֧�п���ʹ��e���ã�e���ñ�����ڴ��ַ���Ǹ�new�����쳣������ڴ��ַ��
            // catch�ǲ�׽�쳣֮���ߵķ�֧��
            // ��catch��֧�и�ʲô�������쳣
            System.out.println("�ļ��Ҳ���������·������");
            System.out.println(e);  // java.io.FileNotFoundException: D:\GitHub\Java\com.zoo\Chapter21\out\com\huawei\javase\exception\test\ѧϰ����.txt (ϵͳ�Ҳ���ָ����·����)
            // e.printStackTrace();
        }
        System.out.println("main over");
    }

    private static void m1() throws FileNotFoundException{
        System.out.println("m1 begin");
        m2();
         // ���ϴ�����쳣���������޷�ִ�еġ�
        System.out.println("m1 over");
    }

    // �ױ�Ĳ��У���ClassCastException˵���㻹��û�ж�FileNotFoundException���д���
    //private static void m2() throws ClassCastException{
    // ��FileNotFoundException�ĸ�����IOException�������ǿ��Եġ���ΪIOException����FileNotFoundException
    //private static void m2() throws IOException {
    // ����Ҳ���ԣ���ΪException�������е��쳣��
    //private static void m2() throws Exception{
    // throws����Ҳ����д����쳣������ʹ�ö��Ÿ�����
    //private static void m2() throws ClassCastException, FileNotFoundException{
    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        // ����������ԭ���ǣ�m3()��������λ�����У�throws FileNotFoundException
        // �������������m3()û�ж��쳣����Ԥ�������Ա��뱨��
        m3();

        // try {
        //     m3();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // ������������쳣���������޷�ִ�еģ�
        System.out.println("m2 over");
        
    }

    private static void m3() throws FileNotFoundException {
        // ����SUN jdk��ĳ����Ĺ��췽����
        // ����໹û�нӴ���������IO����ʱ���֪���ˡ�
        // ����ֻ�ǽ��������ѧϰһ���쳣������ơ�
        // ����һ�����������󣬸���ָ��һ���ļ���
        /*
        ���뱨���ԭ����ʲô��
            ��һ�����������һ�����췽����FileInputStream(String name)
            �ڶ���������췽��������λ�����У�throws FileNotFoundException
            ������ͨ����ļ̳нṹ������FileNotFoundException������IOException��IOException�ĸ�����Exception��
            ���յ�֪��FileNotFoundException�Ǳ���ʱ�쳣��

            ����ԭ�򣿱���ʱ�쳣Ҫ�����Ա��д����׶α���������д���������������ͱ���
         */
        //new FileInputStream("D:\\course\\01-����\\ѧϰ����.txt");

        // ���ǲ��õ�һ�ִ���ʽ���ڷ���������λ����ʹ��throws�������ס�
        // һ�������嵱�еĴ�������쳣֮������ϱ��Ļ����˷���������
        System.out.println("m3 begin");
        new FileInputStream("D:\\GitHub\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\ѧϰ����.txt");
        System.out.println("������ϴ�����쳣�������ִ����??????????????????���ᣡ����");
        System.out.println("m3 over");
    }

}
