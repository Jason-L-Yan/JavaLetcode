/**
 * ս������һ����ƶ����������������
 */
public class Fighter extends Weapon implements Moveable, Shootable {

    @Override
    public void move() {
        System.out.println("ս�����ڻ������У�");
    }

    @Override
    public void shoot() {
        System.out.println("ս�����ڿ���");
    }

    @Override
    public String toString() {
        return "ս����";
    }

}
