package com.huawei.javase.exception;

public class ExceptionTest16 {
    public static void main(String[] args) {
        HomeworkStack stack = new HomeworkStack();
        // Ñ¹Õ»
        try {
            stack.push(new Object());  // ²»¼Ó²¶×½£¬»á±¨´í
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            stack.push(new Object());  
            // ÕâÀïÕ»ÒÑÂú
            stack.push(new Object());  
        } catch (MyStackOperationException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        // µ¯Õ»
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
            // µ¯Õ»Ê§°Ü
            stack.pop();
        } catch (MyStackOperationException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
            
        }
    }
}
