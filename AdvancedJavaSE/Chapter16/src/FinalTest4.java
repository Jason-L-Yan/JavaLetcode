public class FinalTest4 {
     public static void main(String[] args){
        System.out.println(Chinese.COUNTRY);
     }
}


class Chinese{
    // 身份证号，每个人都不一样，是对象级别的。所以设置实例变量。
    String idCard;
    // 同上
    String name;
    // 同上
    String birth;
    // 假设国家是一个固定值：“中国”
    // 实例变量在堆中，一个对象一份，100个对象100分。
    // 但是，实例变量用final修饰了，说明该实例变量不会随着对象的变化而变化；
    // 该实例变量前面添加static关键字，变为静态的，存储在方法区；节省内存。
    static final String COUNTRY = "中国";

}
