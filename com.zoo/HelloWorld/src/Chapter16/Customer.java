package Chapter16;

public class Customer {
    // 顾客手里有一个菜单。
    // 实例变量，属性
    // 面向抽象编程，降低耦合度。
    private FoodMenu foodMenu;

    public Customer() {
    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    // setter 与 getter 方法
    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public void order() {
        // FoodMenu fm = this.getFoodMenu();
        // 或者用以下语法，因为在一个类中，所以private可以调用
        // 此处不是ChinaCooker.shiZiChaoJiDan()也不是AmericaCooker.shiZiChaoJiDan()扩展项强。
        foodMenu.shiZiChaoJiDan();
        foodMenu.yuXiangRouSi();
    }

}
