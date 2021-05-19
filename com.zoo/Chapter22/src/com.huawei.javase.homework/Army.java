public class Army {
    /**
     * 武器数组
     */
    private Weapon[] weapons;

    public Army() {
    }

    /**
     * 创建军队的构造方法。
     * 
     * @param count 武器数量。
     */
    public Army(int count) {
        // 动态初始化数组中每一个元素默认值为null
        // 武器数组有了，但是武器数组中没有放武器
        this.weapons = new Weapon[count]; //
    }

    /**
     * 将武器加入数组
     * 
     * @param weapon 被添加的武器
     * @throws AddWeaponIndexOutOfBound
     */
    public void addWeapon(Weapon weapon) throws AddWeaponIndexOutOfBound {
        for (int i = 0; i < this.weapons.length; i++) {
            if (null == this.weapons[i]) {
                this.weapons[i] = weapon;
                System.out.println(weapon + "添加成功！");
                return;
            }
        }

        // 程序如果执行到这，说明添加失败。
        // 如果武器库满了，抛出异常。
        throw new AddWeaponIndexOutOfBound("添加武器库越界");
    }

    /**
     * 所有可攻击的武器攻击
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
     * 所有可移动的武器移动
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
