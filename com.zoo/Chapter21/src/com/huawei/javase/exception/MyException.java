/*
1��SUN�ṩ��JDK���õ��쳣�϶��ǲ������õġ���ʵ�ʵĿ����У��кܶ�ҵ��
��Щҵ������쳣֮��JDK�ж���û�еġ���ҵ��ҹ��ġ���ô�쳣������
����Ա�����Լ�������
    ���ԡ�

2��Java����ô�Զ����쳣�أ�
    ������
        ��һ������дһ����̳�Exception����RuntimeException.
        �ڶ������ṩ�������췽����һ���޲����ģ�һ������String�����ġ�

    ����Ӳ����
 */
package com.huawei.javase.exception;

public class MyException extends Exception{

    public MyException() {
    }  // ����ʱ�쳣

    public MyException(String message) {
        super(message);
    }
    
    
}

// public class MyException extends RuntimeException{  // ����ʱ�쳣
    
// }
