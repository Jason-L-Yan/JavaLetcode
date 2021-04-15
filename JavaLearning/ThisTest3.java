// package JavaLearning;
// this什么时候不能省略
public class ThisTest3 {
    public static void main(String[] args){
        Student6 s = new Student6();
        s.setNo(111);
        s.setName("张三");
        System.out.println("学号：" + s.getNo());
        System.out.println("姓名：" + s.getName());
        
        Student6 s2 = new Student6(222, "李四");
        System.out.println("学号：" + s2.getNo());
        System.out.println("姓名：" + s2.getName());
    }
    
}

class Student6{
    private int no;
    private String name;
    
    // 构造方法
    public Student6(){

    }

    public Student6(int no, String name){
        this.no = no;
        this.name = name;

    }

    // no封装
    public int getNo(){
        return no;
    }

    public void setNo(int no){
        // no 是局部变量
        // this.no 是实例变量
        this.no = no;  // 此处 "this." 不能省略：区分局部变量和实例变量
    }

    // name封装
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}