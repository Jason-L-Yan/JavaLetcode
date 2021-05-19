/**
 * 战斗机是一款可移动、可射击的武器。
 */
public class Fighter extends Weapon implements Moveable, Shootable {

    @Override
    public void move() {
        System.out.println("战斗机在机动绕行！");
    }

    @Override
    public void shoot() {
        System.out.println("战斗机在开火！");
    }

    @Override
    public String toString() {
        return "战斗机";
    }

}
