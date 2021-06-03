package com.huawei.javase.thread;
/*
ʵ���̵߳ĵ����ַ�ʽ��
    ʵ��Callable�ӿ�
    ���ַ�ʽ���ŵ㣺���Ի�ȡ���̵߳�ִ�н����
    ���ַ�ʽ��ȱ�㣺Ч�ʱȽϵͣ��ڻ�ȡt�߳�ִ�н����ʱ�򣬵�ǰ�߳���������Ч�ʽϵ͡�
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
// JUC���µģ�����java�Ĳ���������JDK��û��������������ԡ�
import java.util.concurrent.FutureTask;

public class ThreadTest15 {
    
    // ��һ��������һ����δ�������ࡱ����
    // �����ǳ���Ҫ����Ҫ��һ��Callable�ӿ�ʵ�������
    public static void main(String[] args) {
        // ��һ��������һ����δ�������ࡱ����
        // FutureTask(callable):�з���ֵ��FutureTask(Runnable,object)�޷���ֵ
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception { // call()�������൱��run������ֻ��������з���ֵ
                // �߳�ִ��һ������ִ��֮����ܻ���һ��ִ�н��
                // ģ��ִ��
                System.out.println("call method begin");
                Thread.sleep(1000 * 10);
                System.out.println("call method end!");
                int a = 100;
                int b = 200;
                return a + b; //�Զ�װ��(300������Integer)
            }
        });

        // �����̶߳���
        Thread t = new Thread(task);
        // �����߳�
        t.start();
        // ������main���������������߳��С�
        // �����߳��У���ô��ȡt�̵߳ķ��ؽ����
        // get()������ִ�лᵼ�¡���ǰ�߳�������
        Object obj = null;
        try {
            obj = task.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("�߳�ִ�н����" + obj);

        // main��������ĳ���Ҫ��ִ�б���ȴ�get()�����Ľ���
        // ��get()����������Ҫ�ܾá���Ϊget()������Ϊ������һ���̵߳�ִ�н��
        // ��һ���߳�ִ������Ҫʱ��ġ�
        System.out.println("hello world!");
    }

}
