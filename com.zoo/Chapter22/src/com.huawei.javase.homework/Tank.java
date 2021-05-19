/**
 * 坦克是一个可移动可射击的武器
 */
public class Tank extends Weapon implements Moveable, Shootable {

    @Override
    public void move() {
        System.out.println("坦克移动！");
    }

    @Override
    public void shoot() {
        System.out.println("坦克在射击！");
    }

    @Override
    public String toString() {
        return "坦克";
    }

}
