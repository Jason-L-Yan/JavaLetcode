package JavaLearning;

public class Homework11 {
    public static void main(String[] args){
        System.out.println("请输入用户名和密码。");
        java.util.Scanner s = new java.util.Scanner(System.in);
        String userName = s.next();
        int password = s.nextInt();
        if(logIn(userName, password)){
            System.out.println("欢迎"+userName+"登录！" );
        }else{
            System.out.println("登录失败！");
        }
        s.close();
    }


    public static boolean logIn(String userName, int password ){
       
        // 字符串.equals(字符串)：用来比较两个字符串是否相等；字符串==字符串是比较的地址是否相等，除非是同一个变量，否则都是false。
        if(userName.equals("admin") && password == 123){
            
            return true;
        }else{
            return false;
        }
    }
    
}
