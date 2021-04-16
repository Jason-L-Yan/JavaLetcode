
public class OverrideTest {
    public static void main(String[] args){
        Birds bird = new Birds();
        bird.move();

    }
    
}


class Animal2{
    public void move(){
        System.out.println("动物在移动！");
    }
}


class Birds extends Animal2{

}
