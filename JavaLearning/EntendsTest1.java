public class EntendsTest1 {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.move();
        System.out.println(cat.name);

    }
    
}


class Animal{
    // 名字先不封装
    String name = "小花";

    public void move(){
        System.out.println(name + "正在移动。");
    }

}


class Cat extends Animal{

}

