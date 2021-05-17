package Chapter20.com.huawei.javaSE.random;

import java.util.Random;

public class RandomTest1 {
    public static void main(String[] args) {
        // 创建随机数对象
        Random r = new Random();
        // 随机产生一个int类型取值范围内的数字。
        int nums = r.nextInt();
        System.out.println(nums);

        // 产生[0~100]之间的随机数。不能产生101。
        // nextInt翻译为：下一个int类型的数据是101，表示只能取到100.
        int nums2 = r.nextInt(101);
        System.out.println(nums2);
    }
}
