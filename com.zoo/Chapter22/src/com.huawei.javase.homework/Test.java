public class Test {
    public static void main(String[] args) {
        // 构建一个军队
        Army army = new Army(4);
        // 创建武器对象
        Fighter fighter = new Fighter();
        Fighter fighter2 = new Fighter();
        Tank tank = new Tank();
        WuZiYunShuJi wuZiYunShuJi = new WuZiYunShuJi();
        GaoShePao gaoShePao = new GaoShePao();
        // 添加武器
        try {
            army.addWeapon(fighter);
            army.addWeapon(tank);
            army.addWeapon(wuZiYunShuJi);
            army.addWeapon(gaoShePao);
            // 会出现异常
            army.addWeapon(fighter2);
        } catch (AddWeaponIndexOutOfBound e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        // 让所有可移动的移动
        army.moveAll();
        System.out.println("====================");
        // 让所有可攻击的攻击
        army.attackAll();
    }
}
