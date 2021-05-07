
public class InterfaceTest3 {
    public static void main(String[] args){
        
    }
}


interface X{

}
interface Y{
}
// 接口和接口支持多继承
interface Z extends X, Y{

}



interface A{
    void m1();
}


interface B{
    void m2();
}


interface C{
    void m3();
}


class D implements A, B, C{
    public void m1(){

    }

    public void m2(){

    }

    public void m3(){
        
    }
}















