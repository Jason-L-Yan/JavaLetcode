/**
 * 运输机是一款只能运输物资的武器。
 */
public class WuZiYunShuJi extends Weapon implements Moveable {

    @Override
    public void move() {
        System.out.println("运输机在运输物资！");
    }

    @Override
    public String toString() {
        return "物资运输机";
    }

}
