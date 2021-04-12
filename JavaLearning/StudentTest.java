package JavaLearning;

@SuppressWarnings("unused")

public class StudentTest {
    public static void main(String[] args){
        /**
         * 创建对象的语法：
         * new 类名()
         * 类是一个模板，通过一个类可以创建N多个对象。
         * new是一个运算法。专门负责对象的创建。
         */
        // Student是里另一个java文件中创建的类。
        Student s1 = new Student(); 
        Student s2 = new Student(); 
        Student s3 = new Student(); 
        /**和 int i = 100； 的性质一样
         * 解释一下：
         * i 是变量名
         * int 数变量的数据类型
         * 100 数具体数据
         * Student 是变量 s1 的数据类型。
         * 数据类型包括两种：
         * 基本数据类型：8种
         * 引用数据类型：String、Student……
         * Student既是一个类名，同时又是一个“类型名”，是引用数据类型名。
         * java中所有的类都是引用数据类型。
         * new Student()这是一个对象，（学生类创建出来的对象）
         * s1 是变量名（s1 不能叫做对象，只是一个变量名字。）
         * * 以上这个程序相当于通过Student类实例化了3个Student对象。
         * 创建对象的数量没有限制。
         */

    }
    
}
