package Chapter17;

public class TestPower {
    public static void main(String[] args) {
        User user = new User();
        // 私有属性不能访问
        // System.out.println(user.id);
        // protected
        System.out.println(user.age);
        // public
        System.out.println(user.weight);
        // 默认权限
        System.out.println(user.name);

    }
    
}
