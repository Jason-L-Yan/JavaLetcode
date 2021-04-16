public class TestPrintln {

    static Student8 stu = new Student8();
    public static void main(String[] args){
        /**
         * TestPrintln 相当于 System
         * 学生对象stu 相当于 out
         * exam() 相当于 println()
         */
        TestPrintln.stu.exam();
    }
    
}


class Student8{
    public void exam(){
        System.out.println("考试。。。。");
    }
}
