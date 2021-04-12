package JavaLearning;

public class MethodTest2 {
    public static void main(String[] args){
        for(int i =0; i < 10; i++){
            if(i == 5){
                return;
            }
            System.out.println("i = " + i);
        }      
    }
}
