package Chapter16;
public class CustomerConsume {
    public static void main(String[] args) {
        // 创建厨师对象
        FoodMenu cooker1 = new ChinaCooker();
        FoodMenu cooker2 = new AmericaCooker();
        // 创建顾客对象
        Customer customer1 = new Customer(cooker1);
        Customer customer2 = new Customer(cooker2);
        // 顾客点菜
        customer1.order();
        customer2.order();
    }

}
