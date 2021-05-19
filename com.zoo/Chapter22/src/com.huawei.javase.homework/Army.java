public class Army {
    /**
     * ��������
     */
    private Weapon[] weapons;

    public Army() {
    }

    /**
     * �������ӵĹ��췽����
     * 
     * @param count ����������
     */
    public Army(int count) {
        // ��̬��ʼ��������ÿһ��Ԫ��Ĭ��ֵΪnull
        // �����������ˣ���������������û�з�����
        this.weapons = new Weapon[count]; //
    }

    /**
     * ��������������
     * 
     * @param weapon ����ӵ�����
     * @throws AddWeaponIndexOutOfBound
     */
    public void addWeapon(Weapon weapon) throws AddWeaponIndexOutOfBound {
        for (int i = 0; i < this.weapons.length; i++) {
            if (null == this.weapons[i]) {
                this.weapons[i] = weapon;
                System.out.println(weapon + "��ӳɹ���");
                return;
            }
        }

        // �������ִ�е��⣬˵�����ʧ�ܡ�
        // ������������ˣ��׳��쳣��
        throw new AddWeaponIndexOutOfBound("���������Խ��");
    }

    /**
     * ���пɹ�������������
     */
    public void attackAll() {
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Shootable) {
                Shootable shootable = (Shootable) weapons[i];
                shootable.shoot();
            }
        }
    }

    /**
     * ���п��ƶ��������ƶ�
     */
    public void moveAll() {
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Moveable) {
                Moveable moveable = (Moveable) weapons[i];
                moveable.move();
            }
        }
    }

}
