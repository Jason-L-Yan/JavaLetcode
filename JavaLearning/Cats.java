// 子类：猫
public class Cats extends Animals{
    // 重写移动的方法
    public void move(){
        System.out.println("猫在走猫步！！！");
    }
    
    // 子类特有的方法。
    public void catchMouse(){
        System.out.println("猫正在抓老鼠！！！");
    }
}
