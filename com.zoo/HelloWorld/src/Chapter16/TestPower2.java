package Chapter16;

import Chapter17.User;

public class TestPower2 extends User {

    // ʵ������
    public void shopping() {
        System.out.println("protectedȨ��:" + this.age);
    }

    public static void main(String[] args) {
        User user = new User();
        TestPower2 testPower2 = new TestPower2();
        testPower2.shopping();
        // protectedȨ�������Ϊֹ��Ȼ���ܷ��ʣ��������Ϸ�ʵ�������п��Է���
        // System.out.println(user.age);
        // public
        System.out.println("����");
        System.out.println(user.weight);
        // Ĭ��Ȩ��
        // System.out.println(user.name);
    }
}
