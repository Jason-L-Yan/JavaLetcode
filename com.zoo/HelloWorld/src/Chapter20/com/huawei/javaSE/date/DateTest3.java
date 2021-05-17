package Chapter20.com.huawei.javaSE.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest3 {
    public static void main(String[] args) {
        
        // 这个时间是什么时间？
        // 1970-01-01 00:00:00 001
        Date time = new Date(1);  // // 注意：参数是一个毫秒，加1ms
        System.out.println(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm-ss SSS");
        String strTime = sdf.format(time);
        // 北京是东8区。差8个小时。
        System.out.println(strTime);  // 1970-01-01 08:00:00 001
        
        // 获取昨天的此时的时间。
        Date time2 = new Date();  // // 注意：参数是一个毫秒，加1ms
        Date yesterday = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        String strTime2 = sdf.format(yesterday);
        // 今天时间
        System.out.println(sdf.format(time2));
        // 昨天时间
        System.out.println(strTime2);
    }
    
}
