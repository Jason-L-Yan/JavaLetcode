public class TestInterface2 implements TestintInterface, Cqq{
    public static void main(String[] args) {
        double pi = TestintInterface.PI;
        TestintInterface testintInterface = ()->1;
        System.out.println("=====================");
        System.out.println(testintInterface);
        System.out.println("======================");
        testintInterface.test();
        TestintInterface.getInfo(1, true);
        System.out.println(pi);


    }

    @Override
    public int sum() {
        return 0;
    }

    @Override
    public int sum2() {
        return 0;
    }

    @Override
    public int sum3() {
        return 0;
    }
}

// ����ӿ�
interface Aqq{
    int sum2();
}

// �ӿ�֧�ּ̳�
interface Bqq extends Aqq{
    int sum3();
}

// һ���ӿڿ��Լ̳ж���ӿڣ�֧�ֶ�̳У�
interface Cqq extends Aqq, Bqq{

}