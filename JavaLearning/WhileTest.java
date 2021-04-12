package JavaLearning;

public class WhileTest{
    public static void main(String[] args){
        int i = 10;
        while(i < 100){
            System.out.println(i);
            i++;
        }
        int m = 0;
        do{
            System.out.println("do……while……测试" + m);
            m++;
        }while(m < 5);
    }
}