package JavaLearning;

public class Test6 {
    public static void main(String[] args){
        // int i = 100;
        User u = new User();
        Address a = new Address();
        a.city = "南京";
        a.street = "泉山街道";
        a.zipCode = 221700;
        System.out.println(u.id);    // 0
        System.out.println(u.userName);  // null
        System.out.println(u.addr);  // 引用数据类型，默认为null

        u.id = 1111;
        u.userName = "王五";
        u.addr = a;
        System.out.println(u.addr.city);
        System.out.println(u.addr.street);
        System.out.println(u.addr.zipCode);
        
    }
    
}
