package JavaLearning;

public class MethodTest1 {
    public static void main(String[] args){
        daYin1();
        MyClass.daYin2();

    }


    public static void daYin1(){
        System.out.println("打印1");
    }
    
}

class MyClass{
    public static void daYin2(){
        System.out.println("打印2");
    }
}
