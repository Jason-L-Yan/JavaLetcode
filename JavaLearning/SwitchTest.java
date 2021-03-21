package JavaLearning;

public class SwitchTest{
    public static void main(String[] args){
        System.out.println("请输入【0-6】的整数：");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int number = s.nextInt();
        boolean flag = true;
        String date = "星期日";
        // switch(number){
        // case 0:
        //     date = "星期日";    
        //     break;
        // case 1:
        //     date = "星期一"; 
        //     break;
        // case 2:
        //     date = "星期二"; 
        //     break;
        // case 3:
        //     date = "星期三"; 
        //     break;
        // case 4:
        //     date = "星期四"; 
        //     break;
        // case 5:
        //     date = "星期五";
        //     break;
        // case 6:
        //     date = "星期六";
        //     break;  
        // default:
        //     System.out.print("输入数字有误！！");
        //     flag = false;

        // }
        // if(flag)
        //     System.out.print(date);
        switch(number){
        
        case 0: case 1: case 2:
            System.out.println(date);


        }
    }
}
