package Chapter18;

/*
	关于Object类中的toString()方法

		1、源代码长什么样？
			public String toString() {
				return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
			}
			源代码上toString()方法的默认实现是：
				类名@对象的内存地址转换为十六进制的形式

		2、SUN公司设计toString()方法的目的是什么？
			toString()方法的作用是什么？
				toString()方法的设计目的是：通过调用这个方法可以将一个“java对象”转换成“字符串表示形式”

		3、其实SUN公司开发java语言的时候，建议所有的子类都去重写toString()方法。
		toString()方法应该是一个简洁的、详实的、易阅读的.
*/
public class TestObject {
    public static void main(String[] args) {
        MyTime myTime = new MyTime();
        String s1 = myTime.toString();
        // MyTime类重写toString()方法之前。
        System.out.println(s1);
    }

}

class MyTime {
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 重写toString()方法（一般都要重写）
    // 这个toString()方法怎么重写呢？
    // 越简洁越好，可读性越强越好。
    // 向简洁的、详实的、易阅读的方向发展
    @Override
    public String toString() {
        return "MyTime [day=" + day + ", month=" + month + ", year=" + year + "]";
    }

}
