package com.huawei.javase.exception;

public class ExceptionTest16 {
    public static void main(String[] args) {
        HomeworkStack stack = new HomeworkStack();
        // ѹջ
        try {
            stack.push(new Object());  // ���Ӳ�׽���ᱨ��
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            // ����ջ����
            stack.push(new Object());  
        } catch (MyStackOperationException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        // ��ջ
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            // ��ջʧ��
            stack.pop();
        } catch (MyStackOperationException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
            
        }
    }
}
