package com.huawei.javase.exception;
/*
֮ǰ�ڽ��ⷽ�����ǵ�ʱ�򣬵�ʱ������һ�����⣿
    ��д֮��ķ������ܱ���д֮ǰ�ķ����׳����ࣨ���������쳣�����Ը��١�
 */
public class ExceptionTest17 {
    
}


class Animal {
    public void doSome() {

    }

    public void doOther() throws Exception {

    }
}

class Cat extends Animal {

    @Override
    public void doSome() throws RuntimeException {
        super.doSome();
    }

    // ��д����ʱ������û�����쳣�����಻���ױ���ʱ�쳣
    // @Override
    // public void doSome() throws Exception{
    
    // }

    // ���¶�����ȷ��
    // ��д����ʱ�������ף�������Բ���
    // @Override
    // public void doOther() {
        
    // }

    // @Override
    // public void doOther() throws Exception {
    //     super.doOther();
    // }

    // Ҳ�����׸�С���쳣
    @Override
    public void doOther() throws NullPointerException {
        
    }

    
    
    
}

/*
�ܽ��쳣�еĹؼ��֣�
    �쳣��׽��
        try
        catch
        finally

    throws �ڷ�������λ����ʹ�ã���ʾ�ϱ��쳣��Ϣ�������ߡ�
    throw �ֶ��׳��쳣��
 */