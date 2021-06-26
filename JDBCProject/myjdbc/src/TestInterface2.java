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

// 定义接口
interface Aqq{
    int sum2();
}

// 接口支持继承
interface Bqq extends Aqq{
    int sum3();
}

// 一个接口可以继承多个接口（支持多继承）
interface Cqq extends Aqq, Bqq{

}