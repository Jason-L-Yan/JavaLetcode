package Chapter16;

import Chapter17.User;

public class TestPower2 extends User {

    // 实例方法
    public void shopping() {
        System.out.println("protected权限:" + this.age);
    }

    public static void main(String[] args) {
        User user = new User();
        TestPower2 testPower2 = new TestPower2();
        testPower2.shopping();
        // protected权限在这个为止依然不能访问，但是在上方实例方法中可以访问
        // System.out.println(user.age);
        // public
        System.out.println("测试");
        System.out.println(user.weight);
        // 默认权限
        // System.out.println(user.name);
    }
}
