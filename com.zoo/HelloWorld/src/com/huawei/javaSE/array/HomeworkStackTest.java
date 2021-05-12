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
        stack.push(new Object());  // 最后压入，最先弹出来
        // 压栈失败，栈已满！
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
        // 模拟栈，真正的栈弹出数据之后，为空，此处模拟的是他的功能。
        System.out.println(stack.getElements().length);
    }
}
