package com.huawei.javaSE.array;

public class HomeworkStackTest {
    public static void main(String[] args) {
        HomeworkStack stack = new HomeworkStack();
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());  // ���ѹ�룬���ȵ�����
        // ѹջʧ�ܣ�ջ������
        stack.push(new Object());

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
        stack.pop();
        stack.pop();
        stack.pop();
        // ģ��ջ��������ջ��������֮��Ϊ�գ��˴�ģ��������Ĺ��ܡ�
        System.out.println(stack.getElements().length);
    }
}
