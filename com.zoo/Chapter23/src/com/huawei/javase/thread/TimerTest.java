package com.huawei.javase.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        // ������ʱ������
        Timer timer = new Timer();
        Date firstTime = null;
        //Timer timer = new Timer(true); //�ػ��̵߳ķ�ʽ

        // ָ����ʱ����
        //timer.schedule(��ʱ����, ��һ��ִ��ʱ��, ������ִ��һ��);
        // ע������:(�£�MM ��д)��(���ӣ�mm Сд)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // Date firstTime = sdf.parse("2021-06-03 11:21:00");
        try {
            firstTime = sdf.parse("2021-06-03 11:25:30");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        timer.schedule(new LogTimerTask(), firstTime, 1000 * 10);
        // ÿ��ִ��һ�Ρ�
        //timer.schedule(new LogTimerTask() , firstTime, 1000 * 60 * 60 * 24 * 365);

        //�����ڲ��෽ʽ
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                // code....
            }
        } , firstTime, 1000 * 10);
    }
}

// ��дһ����ʱ������
// ��������һ����¼��־�Ķ�ʱ����
class LogTimerTask extends TimerTask {

    @Override
    public void run() {
        // ��д����Ҫִ�е���������ˡ�
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime + ":�ɹ������һ�����ݱ��ݣ�");
    }
    
}
