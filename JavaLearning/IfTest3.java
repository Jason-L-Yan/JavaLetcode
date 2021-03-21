package JavaLearning;

public class IfTest3 {
    public static void main(String[] args){
        
        boolean sex = true;
        if(sex){
            System.out.println("男");

        }else{
            System.out.println("女");
        }
        // 三目运算符
        System.out.println(sex?"男":"女");
        
        // 永远是真的, else语句不再运行
        if(sex = true){
            System.out.println("男");

        }else{
            System.out.println("女");
        }
        // 一句话不用加括号
        if (sex)
            System.out.println("男");
            // System.out.println("女");
        else
            System.out.println("女");
    }
}
