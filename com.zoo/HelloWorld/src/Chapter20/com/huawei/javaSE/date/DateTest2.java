/*
获取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数。
1秒 = 1000毫秒

简单总结一下System类的相关属性和方法：
    System.out 【out是System类的静态变量。】
    System.out.println() 【println()方法不是System类的，是PrintStream类的方法。】
    System.gc() 建议启动垃圾回收器
    System.currentTimeMillis() 获取自1970年1月1日到系统当前时间的总毫秒数。
    System.exit(0) 退出JVM。
 */

package Chapter20.com.huawei.javaSE.date;

public class DateTest2 {
    public static void main(String[] args) {
        // 类直接掉是静态方法。
        long nowTimeMilis = System.currentTimeMillis();
        System.out.println(nowTimeMilis);  // 1621066266656
        long begin = System.currentTimeMillis();
        print();
        System.out.println("耗费时长：" + (System.currentTimeMillis() - begin)); 
    }

    // 统计一个方法执行耗费时长
    public static void print() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("i = " + i);
        }
    }
    
}

