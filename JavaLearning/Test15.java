package JavaLearning;

public class Test15 {
    public static void main(String[] args){
        Test15 u1 = new Test15();
        System.out.println("输入和是：" + u1.sumInt(20, 30));
    }
    
    // 实例方法
    public int sumInt(int n, int m){
        return m+n;
    }
}
