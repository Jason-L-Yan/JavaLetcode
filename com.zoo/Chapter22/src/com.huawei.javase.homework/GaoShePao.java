/**
 * 高射炮是一款不能移动，可以攻击的武器
 */
public class GaoShePao extends Weapon implements Shootable {

    @Override
    public void shoot() {
        System.out.println("高射炮开炮。。。");
    }

    @Override
    public String toString() {
        return "高射炮";
    }

}
