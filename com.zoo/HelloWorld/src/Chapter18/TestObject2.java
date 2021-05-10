package Chapter18;

/*
	关于Object类中的equals方法
		1、equals方法的源代码
			public boolean equals(Object obj) {
				return (this == obj);
			}
			以上这个方法是Object类的默认实现。
				
		
		2、SUN公司设计equals方法的目的是什么？
			以后编程的过程当中，都要通过equals方法来判断两个对象是否相等。
			equals方法是判断两个对象是否相等的。
		
		3、我们需要研究一下Object类给的这个默认的equals方法够不够用！！！！
				在Object类中的equals方法当中，默认采用的是“==”判断两个java对象
				是否相等。而“==”判断的是两个java对象的内存地址，我们应该判断
				两个java对象的内容是否相等。所以老祖宗的equals方法不够用，
				需要子类重写equals。
		
		4、判断两个java对象是否相等，不能使用“==”，因为“==”比较的是两个
		对象的内存地址。
*/
public class TestObject2 {
    public static void main(String[] args) {
        // 控制中文可以正常从控制台输入输出。
        System.setProperty("file.encoding", "GBK");
        // 判断两个基本数据类型的数据是否相等直接使用“==”就行。
        int a = 100;
        int b = 100;
        // 这个“==”是判断a中保存的100和b中保存的100是否相等。
        System.out.println(a == b);

        // 判断两个java对象是否相等，我们怎么办？能直接使用“==”吗？
        // 创建一个日期对象是：2008年8月8日。
        MyTime2 t1 = new MyTime2(2008, 8, 8);
        // System.out.println("t1的内存地址" + t1);
        // 创建了一个新的日期对象，但表示的日期也是：2008年8月8日。
        MyTime2 t2 = new MyTime2(2008, 8, 8);
        // System.out.println("t2的内存地址" + t2);

        MyTime2 t3 = new MyTime2(2008, 8, 9);
        // System.out.println("t3的内存地址" + t3);
        // 测试以下，比较两个对象是否相等，能不能使用“==”？？？
        // 这里的“==”判断的是：t1中保存的对象内存地址和t2中保存的对象内存地址是否相等。
        System.out.println(t1 == t2); // false
        // 重写之前，是和上方的功能一样，判断地址是否相同,以下两句话均为false，重写之后，flag = true。
        boolean flag = t1.equals(t2);
        System.out.println("flag:" + flag);
        System.out.println(t1.equals(t3));

        MyTime2 t4 = null; // 不是bug
        System.out.println(t1.equals(t4));
    }

}

class MyTime2 {
    int year;
    int month;
    int day;

    public MyTime2() {
    }

    public MyTime2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyTime [day=" + day + ", month=" + month + ", year=" + year + "]";
    }

    // @Override
    // public boolean equals(Object obj) {
    // //当年相同，月相同，并且日也相同的时候，表示两个日期相同。两个对象相等。
    // // 获取第一个日期的年月日
    // int year1 = this.year;
    // int month1 = this.month;
    // int day1 = this.day;

    // // 获取第二个日期的年月日，这样写不对，因为编译时obj是Object类，没有year、month、day变量，
    // // 这是子类特有的方法必须向下转型。
    // // int year2 = obj.year;
    // // int month2 = obj.month;
    // // int day2 = obj.day;

    // if (obj instanceof MyTime2) {
    // System.out.println("进入");
    // MyTime2 t = (MyTime2)obj;
    // int year2 = t.year;
    // int month2 = t.month;
    // int day2 = t.day;
    // if (year1 ==year2 && month1 == month2 && day1 == day2) {
    // return true;
    // }
    // }
    // return false;
    // }

    // 改良equals方法
    // @Override
    // public boolean equals(Object obj) {
    // // 如果obj是空，直接返回false
    // if (obj == null) {
    // return false;
    // }
    // // 如果obj不是一个MyTime，没必要比较了 ，直接返回false
    // if (!(obj instanceof MyTime2)) {
    // return false;
    // }
    // // 如果this和obj保存的内存地址相同，没必要比较了，直接返回true。
    // // 内存地址相同的时候指向的堆内存的对象肯定是同一个。
    // if (obj == this) {
    // return true;
    // }
    // // 程序能够执行到此处说明什么？
    // // 说明obj不是null，obj是MyTime类型。
    // MyTime2 t = (MyTime2) obj;
    // if (this.year == t.year && this.month == t.month && this.day == t.day){
    // return true;
    // }
    // return false;

    // }

    // 再次改良版
    @Override
    public boolean equals(Object obj) {
        
        if (obj == null || !(obj instanceof MyTime2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        // 程序能够执行到此处说明什么？
        // 说明obj不是null，obj是MyTime类型。
        MyTime2 t = (MyTime2) obj;
        return this.year == t.year && this.month == t.month && this.day == t.day;
    }

}
