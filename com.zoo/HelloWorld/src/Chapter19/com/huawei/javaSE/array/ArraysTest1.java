/**
 * 使用以下SUN公司提供的数组工具类：java.util.Arrays;
 */
package Chapter19.com.huawei.javaSE.array;

import java.util.Arrays;

public class ArraysTest1 {
    public static void main(String[] args) {
        // 工具类中的方法大部分是静态的。
        int[] arr = { 1, 6, 2, 89, 65, 69, 66 };
        Arrays.sort(arr);
        // 遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
