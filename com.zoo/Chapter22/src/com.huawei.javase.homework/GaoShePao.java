/**
 * ��������һ����ƶ������Թ���������
 */
public class GaoShePao extends Weapon implements Shootable {

    @Override
    public void shoot() {
        System.out.println("�����ڿ��ڡ�����");
    }

    @Override
    public String toString() {
        return "������";
    }

}
