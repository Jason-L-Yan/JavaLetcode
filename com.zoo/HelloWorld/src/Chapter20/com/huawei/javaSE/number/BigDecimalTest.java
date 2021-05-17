/*
1��BigDecimal ���ڴ����ݣ����ȼ��ߡ������ڻ����������ͣ�����java���������������ͣ�
����SUN�ṩ��һ���ࡣר�����ڲ���������С�

2��ע�⣺���������double�ǲ����ġ�����֮ǰ��һ��ѧ��ȥ�������ԣ��������������һ�����⣺
    �㴦��������������õ���һ�����ͣ�
        ǧ���˵double��˵java.math.BigDecimal
 */
package Chapter20.com.huawei.javaSE.number;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        // ���100������ͨ��100���Ǿ��ȼ��ߵ�100
        BigDecimal v1 = new BigDecimal(100);
        // ���ȼ��ߵ�200
        BigDecimal v2 = new BigDecimal(200);
        // ���
        // v1 + v2; // �������У�v1��v2�������ã�����ֱ��ʹ��+��͡�
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);  // 300

        BigDecimal v4 = v2.divide(v1);  // ����
        System.out.println(v4);

    }
}
