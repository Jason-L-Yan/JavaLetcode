/*
java�ж����ڵĴ���
    �����������Ҫ���գ�
        ֪ʶ��1����ô��ȡϵͳ��ǰʱ��
        ֪ʶ��2��String ---> Date
        ֪ʶ��3��Date ---> String
 */
package Chapter20.com.huawei.javaSE.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest1 {
    public static void main(String[] args) throws Exception {
        // ��ȡϵͳ��ǰʱ�䣨��ȷ�������ϵͳ��ǰʱ�䣩
        // ֱ�ӵ����޲������췽������
        Date nowTime = new Date();
        System.out.println(nowTime);

        // ���ڿ��Ը�ʽ����
        // ����������Date������ָ���ĸ�ʽ����ת����Date --ת���ɾ���һ����ʽ�������ַ���-->String
        // SimpleDateFormat��java.text���µġ�ר�Ÿ������ڸ�ʽ���ġ�
        /*
        yyyy ��(����4λ)
        MM �£�����2λ��
        dd ��
        HH ʱ
        mm ��
        ss ��
        SSS ���루����3λ�����999��1000�������1�룩
        ע�⣺�����ڸ�ʽ�У�����y M d H m s S��Щ�ַ��������д֮�⣬ʣ�µķ��Ÿ�ʽ�Լ�������֯��
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       
        System.out.println(simpleDateFormat.format(nowTime));

        // ����������һ�������ַ���String����ôת����Date���ͣ�
        // String --> Date
        String time = "2008-08-08 08:08:08 888";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf2.parse(time);
        System.out.println(dateTime);  // Fri Aug 08 08:08:08 CST 2008

    }
}
