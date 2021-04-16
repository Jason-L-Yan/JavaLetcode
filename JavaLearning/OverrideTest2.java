public class OverrideTest2 {
    public static void main(String[] args){
        // 中国人
        Chinese2 chinese = new Chinese2("韩梅梅");
        chinese.speak();
        chinese.setName("李白");
        chinese.speak();
        // 美国人
        American american = new American("杰克儿");
        american.speak();
        american.setName("星悦");
        american.speak();
    }
    
}


// 人
class People{
    private String name; 

    // 构造方法
    public People(){

    }
 
    public People(String name){
        this.name = name;
    }

    // 封装
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    // 人都说话
    public void speak(){
        System.out.println(this.name + "正在说话。。。");
    }

}


class Chinese2 extends People{
    
    public Chinese2(){

    }

    // 这种向父类属性赋值的方法不好，后期学过super之后，采用super
    public Chinese2(String name){
        this.setName(name);
    }

    public void speak(){
        System.out.println(this.getName() + "正在说汉语。。。");
    } 
}


class American extends People{

    // 构造方法
    public American(){

    }

    // 这种向父类属性赋值的方法不好，后期学过super之后，采用super
    public American(String name){
        this.setName(name);
    }

    public void speak(){
        System.out.println(this.getName() + "正在说英语。。。");
    }
}
