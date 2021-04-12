package JavaLearning;

public class SwitchTest2 {
    public static void main(String[] args){
        System.out.println("请输入考生的成绩");
        java.util.Scanner s = new java.util.Scanner(System.in);
        String level = "不及格";
        double score = s.nextDouble();
        // 关键一步
        int grade = (int)(score / 10);
        switch(grade){
            case 9: case 10:
                level = "优";
                break;
            case 8:
                level = "良";
                break;
            case 7:
                level = "中";
                break;
            case 6:
                level = "及格";
                break;
        }
        System.out.println(level);
        
    }
    
}
