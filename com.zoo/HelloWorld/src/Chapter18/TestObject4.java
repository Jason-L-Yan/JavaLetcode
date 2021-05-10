package Chapter18;

public class TestObject4 {
    public static void main(String[] args) {
        Student a1 = new Student(190131049, "重庆邮电大学");
        Student a2 = new Student(190131049, "重庆大学");
        Student a3 = new Student(190131049, "重庆邮电大学");
        System.out.println(a1.equals(a2));
        System.out.println(a1 == a3);
        System.out.println(a1.equals(a3));
        System.out.println("--------------------------------------------");
        System.out.println("你好".equals("你好"));

        System.out.println("********************************************");
        Student a4 = new Student(190131049, new String("重庆邮电大学"));
        // 按道理来说，应该输出 true
        // 但是当 equals中判断语句写成 return this.no == t.no && this.school == t.school;返回false
        // 正确写法应该是：return this.no == t.no && this.school.equals(t.school);
        // String定义变量有可能使用
        // String a = "nihao"; String b = "nihao";
        // 此时判断a == b 是返回true。
        // 但，当使用 String a = new String("nihao"); String b = new String("nihao");
        // 此时判断a == b 是两个对象的地址，返回false。
        // 当使用String中的重写方法equals方法时，无论那种变量定义方式，比较的都是内容。
        System.out.println(a1.equals(a4));

        
    }

}

class Student {
    int no;
    String school;

    public Student(int no, String school) {
        this.no = no;
        this.school = school;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "学号：" + no + ", 所在学校名称：" + school;
    }

    // 需求：当一个学生的学号相等，并且学校相同时，表示同一个学生。
	// 思考：这个equals该怎么重写呢？
	// equals方法的编写模式都是固定的。架子差不多。
    @Override
    public boolean equals(Object obj) {
        
        if (obj == null || !(obj instanceof Student)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        // 程序能够执行到此处说明什么？
        // 说明obj不是null，obj是MyTime类型。
        Student t = (Student) obj;
        // return this.no == t.no && this.school == t.school;  // 不行
        // this.school.equals(t.school)是字符串与字符串比较，不能用双等号==。
        return this.no == t.no && this.school.equals(t.school);

        //字符串用双等号比较可以吗？
		// 不可以
		//return this.no == t.no && this.school == t.school;
    }

}
