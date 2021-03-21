package JavaLearning;

public class IfTest4{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        int age = s.nextInt();
        String str = "老年";
        if(age >= 0 && age <= 5){
            str = "婴幼儿";
        } 
        else if(age <= 10){
            str = "少儿";
        } 
        else if( age <= 18){
            str = "少年";
        } 
        else if(age <= 35){
            str = "青年";
        } 
        else{
            str = "中年";
        }
        System.out.println(str);

    }

}
