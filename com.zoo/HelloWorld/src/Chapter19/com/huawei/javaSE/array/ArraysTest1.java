/**
 * ʹ������SUN��˾�ṩ�����鹤���ࣺjava.util.Arrays;
 */
package Chapter19.com.huawei.javaSE.array;

import java.util.Arrays;

public class ArraysTest1 {
    public static void main(String[] args) {
        // �������еķ����󲿷��Ǿ�̬�ġ�
        int[] arr = { 1, 6, 2, 89, 65, 69, 66 };
        Arrays.sort(arr);
        // �������
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
