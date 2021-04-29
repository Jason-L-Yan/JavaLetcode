public class finalTest {
    public static void main(String[] args){
        B b = new B();
        b.doSome();
        // 多态
        A a = new B();
        // 编译不通过，父类中没有该方法。可以通过强制类型转换进行调用。
        // a.doOther();
        System.out.println("*******************************");
        // 强制类型转换进行调用。
        if(a instanceof B){
            B b1 = (B)a;
            b1.doOther();
        }


    }
}


class A{
    public void doSome(){
        System.out.println("nihao");
    }
}


class B extends A{

    @Override
    public void doSome() {
        super.doSome();
        System.out.println("zhongguo");
    }

    public void doOther(){
        System.out.println("子类独有方法");
    }
}
