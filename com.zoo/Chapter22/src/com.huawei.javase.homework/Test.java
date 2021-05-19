public class Test {
    public static void main(String[] args) {
        // ����һ������
        Army army = new Army(4);
        // ������������
        Fighter fighter = new Fighter();
        Fighter fighter2 = new Fighter();
        Tank tank = new Tank();
        WuZiYunShuJi wuZiYunShuJi = new WuZiYunShuJi();
        GaoShePao gaoShePao = new GaoShePao();
        // �������
        try {
            army.addWeapon(fighter);
            army.addWeapon(tank);
            army.addWeapon(wuZiYunShuJi);
            army.addWeapon(gaoShePao);
            // ������쳣
            army.addWeapon(fighter2);
        } catch (AddWeaponIndexOutOfBound e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        // �����п��ƶ����ƶ�
        army.moveAll();
        System.out.println("====================");
        // �����пɹ����Ĺ���
        army.attackAll();
    }
}
