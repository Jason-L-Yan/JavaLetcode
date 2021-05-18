package com.huawei.javase.exception.Homework;

public class Test {
    public static void main(String[] args) {
        // UserService ∂‘œÛ
        UserService userService = new UserService();
        
        try {
            userService.register("jackson", "1234");
        } catch (IllegalArgumentsExceptionYan e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
