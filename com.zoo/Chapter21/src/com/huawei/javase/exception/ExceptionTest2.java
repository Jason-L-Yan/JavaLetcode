/*
���´��뱨���ԭ����ʲô��
    ��ΪdoSome()��������λ����ʹ���ˣ�throws ClassNotFoundException
    ��ClassNotFoundException�Ǳ���ʱ�쳣�������д����ʱ����û�д���
    ����������
 */
package com.huawei.javase.exception;

public class ExceptionTest2 {
    public static void main(String[] args) {
        // main�����е���doSome()����
        // ��ΪdoSome()��������λ�����У�throws ClassNotFoundException
        // �����ڵ���doSome()������ʱ�����������쳣����Ԥ�ȵĴ���
        // ����������������ͱ���
        //������������Ϣ�� Unhandled exception: java.lang.ClassNotFoundException
        // doSome();
    }

    /**
     * doSome�����ڷ���������λ����ʹ���ˣ�throws ClassNotFoundException
     * ��������ʾdoSome()������ִ�й����У��п��ܻ����ClassNotFoundException�쳣��
     * ������û�ҵ��쳣������쳣ֱ�Ӹ����ǣ�Exception������ClassNotFoundException���ڱ���ʱ�쳣��
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException {
        System.out.println("doSome!!!");
    }
}
