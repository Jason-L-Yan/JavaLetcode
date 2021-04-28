import java.sql.SQLOutput;

public class HomeWork2 {
    public static void main(String[] args) {
        // 无参数构造方法创建对象
        Vehicle v1 = new Vehicle();
        // 通过set方法赋值
        v1.setSize(120);
        v1.setSpeed(5);
        // 有参数构造方法创建对象
        Vehicle v2 = new Vehicle(120,5);

//        System.out.println("speed:" + v1.getSpeed());
//        System.out.println("size:" + v1.getSize());

        System.out.println("speed:" + v2.getSpeed());
        System.out.println("size:" + v2.getSize());
        System.out.println("***********************************");
        System.out.println("***********************************");
        // 加速
        v2.speedUp(10);
        System.out.println("speed:" + v2.getSpeed());

        // 减速
        v2.speedDown(20);
        System.out.println("speed:" + v2.getSpeed());

    }
}

// 交通工具
class Vehicle{
    // 速度
    private int speed;
    // 体积
    private int size;

    public Vehicle() {

    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // 交通工具的移动方法
    public void move(){
        System.out.println("交通工具开始运行。");
    }

    // 加速
    public void speedUp(int addSpeed){
        this.speed += addSpeed;
        this.setSpeed(this.getSpeed() + addSpeed);

    }

    // 减速
    public void speedDown(int downSpeed){
        this.speed -= downSpeed;
        this.setSpeed(this.getSpeed() - downSpeed);
    }
}
