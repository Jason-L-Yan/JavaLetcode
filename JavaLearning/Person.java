package JavaLearning;

public class Person {
    // private 表示私有的，出了这个类将不能使用。
    private int age = 100;
    int userName;
    // 对外部提供简单的访问入口
    // 外部程序只能通过调用以下的代码完成访问
    public int getAge(){
        // System.out.println(age);
        return age;
    }

    public void setAge(int a){
        if(a > 150 || a < 0){
            System.out.println("输入年龄不合法！");
            return;
        }
        age = a;

    }
    
}
