/**
 * 1. this除了可以使用在实例方法中，还可以在构造方法中。
 * 2. 新语法：通过当前的构造方法去调用另一个本类的构造方法，可以使用以下语法格式：this(实际参数列表);
 * 3. 新语法是实现——代码复用。
 */
// package JavaLearning;

public class ThisTest4 {
    public static void main(String[] args){
        Date d1 = new Date();
        d1.detail();

        Date d2 = new Date(2008, 8, 8);
        d2.detail();
    }

}

// 以后写代码都要写封装
class Date{
    private int year;
    private int month;
    private int day;

    // 构造方法无参
    public Date(){
        // 此处this可以省略
        // this.year = 1970;
        // this.month = 1;
        // this.day = 1;

        this(1990, 1, 1);  // 只能出现在第一句。所以一个构造方法只能这样写一次
    }
    
    // 构造方法有参
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 提供一个输出
    public void detail(){
        System.out.println(year + "年" + month +"月" + day + "日");
    }

    // setter与getter方法
    // setter 方法
    public void setYear(int year){
        this.year = year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }
    // getter 方法
    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

}
