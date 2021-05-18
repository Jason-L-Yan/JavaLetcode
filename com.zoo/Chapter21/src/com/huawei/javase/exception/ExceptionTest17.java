package com.huawei.javase.exception;
/*
之前在讲解方法覆盖的时候，当时遗留了一个问题？
    重写之后的方法不能比重写之前的方法抛出更多（更宽泛）的异常，可以更少。
 */
public class ExceptionTest17 {
    
}


class Animal {
    public void doSome() {

    }

    public void doOther() throws Exception {

    }
}

class Cat extends Animal {

    @Override
    public void doSome() throws RuntimeException {
        super.doSome();
    }

    // 重写方法时，父类没有抛异常，子类不能抛编译时异常
    // @Override
    // public void doSome() throws Exception{
    
    // }

    // 以下都是正确的
    // 重写方法时，父类抛，子类可以不抛
    // @Override
    // public void doOther() {
        
    // }

    // @Override
    // public void doOther() throws Exception {
    //     super.doOther();
    // }

    // 也可以抛更小的异常
    @Override
    public void doOther() throws NullPointerException {
        
    }

    
    
    
}

/*
总结异常中的关键字：
    异常捕捉：
        try
        catch
        finally

    throws 在方法声明位置上使用，表示上报异常信息给调用者。
    throw 手动抛出异常！
 */