
/*
�������ֵĸ�ʽ�������˽⣩
 */
package Chapter20.com.huawei.javaSE.number;

import java.text.DecimalFormat;

public class DecimalFormatTest {
    public static void main(String[] args) {
        // java.text.DecimalFormatר�Ÿ������ָ�ʽ���ġ�
        //DecimalFormat df = new DecimalFormat("���ָ�ʽ");
        /*
        ���ָ�ʽ����Щ��
            # ������������
            , ����ǧ��λ
            . ����С����
            0 ������ʱ��0

            ###,###.##
                ��ʾ������ǧ��λ������2��С����
         */
        DecimalFormat decimFormat = new DecimalFormat("###,###.##");
        String s = decimFormat.format(854285231.216);
        System.out.println(s);

        DecimalFormat decimFormat2 = new DecimalFormat("###,###.0000");  // ����4��С��λ����������
        String s2 = decimFormat2.format(1234.56);
        System.out.println(s2);
    }
}
