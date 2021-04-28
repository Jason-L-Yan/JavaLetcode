public class Test {
    public static void main(String[] args){
        // 创建主人对象
        Master zhangSan = new Master();
        // 创建宠物对象
        Dog zangAo = new Dog();
        Cat huaHua = new Cat();
        YingWu yingWu = new YingWu();
        // 主人喂
        zhangSan.feed(zangAo);
        zhangSan.feed(huaHua);
        zhangSan.feed(yingWu);

    }
    
}
