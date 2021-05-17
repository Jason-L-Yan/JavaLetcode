
/*
关于数字的格式化。（了解）
 */
package Chapter20.com.huawei.javaSE.number;

import java.text.DecimalFormat;

public class DecimalFormatTest {
    public static void main(String[] args) {
        // java.text.DecimalFormat专门负责数字格式化的。
        //DecimalFormat df = new DecimalFormat("数字格式");
        /*
        数字格式有哪些？
            # 代表任意数字
            , 代表千分位
            . 代表小数点
            0 代表不够时补0

            ###,###.##
                表示：加入千分位，保留2个小数。
         */
        DecimalFormat decimFormat = new DecimalFormat("###,###.##");
        String s = decimFormat.format(854285231.216);
        System.out.println(s);

        DecimalFormat decimFormat2 = new DecimalFormat("###,###.0000");  // 保留4个小数位，不够补零
        String s2 = decimFormat2.format(1234.56);
        System.out.println(s2);
    }
}
