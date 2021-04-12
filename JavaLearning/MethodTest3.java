package JavaLearning;

public class MethodTest3 {
    public static void main(String[] args){
        int a = D(true);
        System.out.println(a);
        int b = D(false);
        System.out.println(b);

    }

    public static int D(boolean a){
        boolean flag = a;
        return flag ? 1 : 0;
        
    }
    
}
