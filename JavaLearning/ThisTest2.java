// package JavaLearning;

public class ThisTest2 {
    int i = 100;
    static int k = 111;

    public static void main(String[] args){
        // 不能访问 i，因为 i 是实例变量，而main方法是静态方法
        // System.out.println(i);

        // 此种方法可以访问，即new一个对象。
        ThisTest2 tt = new ThisTest2();
        System.out.println(tt.i);  

        System.out.println(ThisTest2.k);  // 同一个类中，类名. 可以省略。
        System.out.println(k);  // 同一个类中，类名. 可以省略。
        

    }
    
}
