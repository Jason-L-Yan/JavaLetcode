package Chapter20.com.huawei.javaSE.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest3 {
    public static void main(String[] args) {
        
        // ���ʱ����ʲôʱ�䣿
        // 1970-01-01 00:00:00 001
        Date time = new Date(1);  // // ע�⣺������һ�����룬��1ms
        System.out.println(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm-ss SSS");
        String strTime = sdf.format(time);
        // �����Ƕ�8������8��Сʱ��
        System.out.println(strTime);  // 1970-01-01 08:00:00 001
        
        // ��ȡ����Ĵ�ʱ��ʱ�䡣
        Date time2 = new Date();  // // ע�⣺������һ�����룬��1ms
        Date yesterday = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        String strTime2 = sdf.format(yesterday);
        // ����ʱ��
        System.out.println(sdf.format(time2));
        // ����ʱ��
        System.out.println(strTime2);
    }
    
}
