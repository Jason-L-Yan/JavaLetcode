// 接口也是一种数据类型
// 接口是完全抽象的（抽象类是半抽象的），
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(MyMath.PI);
    }
}


interface AiPlus{

}

interface CiPlus{

}


// 接口支持多继承
interface BiPlus extends AiPlus, CiPlus{

}



interface MyMath{
    // 变量前默认加 public static final (已省略)
    double PI = 3.1415926;
    // 方法前默认添加 public abstract （已省略）
    int sum();
}
