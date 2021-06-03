package com.huawei.javase.thread;

/*
sleep睡眠太久了，如果希望半道上醒来，你应该怎么办？也就是说怎么叫醒一个正在睡眠的线程？？
    注意：这个不是终断线程的执行，是终止线程的睡眠。
 */
public class ThreadTest8 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();

        // 希望5秒之后，t线程醒来（5秒之后主线程手里的活儿干完了。）
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        };
        // 终断t线程的睡眠（这种终断睡眠的方式依靠了java的异常处理机制。）
        t.interrupt();  // 干扰，一盆冷水过去！
    }
}

class MyRunnable2 implements Runnable {

    // 重点：run()当中的异常不能throws，只能try catch
    // 因为run()方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常。
    // 所以只能try...catch
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "---->begin");
        try {
            // 睡眠一年
            // 只能try catch，不能throws，因为子类不能比父类抛出更宽泛的异常
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
       //1年之后才会执行这里
        System.out.println(Thread.currentThread().getName() + "---->end");
        
    }

    // 其它方法可以throws,doOther()不是重写
    /*public void doOther() throws Exception{

    }*/

}
