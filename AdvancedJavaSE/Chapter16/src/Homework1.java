public class Homework1 {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(13, 59, 39);
        t1.display();
        t1.addSeconds(10);
        t1.display();
    }
}


class MyTime{
    private int hour;
    private int minute;
    private int seconds;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void display(){
        System.out.println( this.hour + "时" + this.minute + "分" + this.seconds + "秒");
        // 或者使用方法的形式进行调用。
        System.out.println( this.getHour() + "时" + this.getMinute() + "分" + this.getSeconds() + "秒");
    }

    public void addSeconds(int seconds){
        this.setSeconds(this.getSeconds() + seconds);
    }

    public void addHour(){

    }

    public void addMinutes(){

    }
}