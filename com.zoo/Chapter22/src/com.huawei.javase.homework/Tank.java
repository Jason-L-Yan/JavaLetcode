/**
 * ̹����һ�����ƶ������������
 */
public class Tank extends Weapon implements Moveable, Shootable {

    @Override
    public void move() {
        System.out.println("̹���ƶ���");
    }

    @Override
    public void shoot() {
        System.out.println("̹���������");
    }

    @Override
    public String toString() {
        return "̹��";
    }

}