/*
ѡ������
    ÿһ�δ���ѡ�����Ƚϵ����ݵ��С��ҳ���Сֵ��
    ���������Сֵ�͡�����Ƚϵ������ǰ���Ԫ�ء�����λ�á�

    ѡ�������ð��������ڣ�ÿһ�εĽ���λ�ö���������ġ�

    �ؼ��㣺ѡ�������еĹؼ����ڣ�����ô�ҳ�һ����������С�ġ�
        3 2 6 1 5
        ���裺
            ��һ��3����С�ġ�
            3��2�Ƚϣ�����2��С�����Դ�ʱ��С����2.

            ��������2���±ȶԣ�2��6�Ƚϣ�2��Ȼ����С�ġ�
            ��������2���±ȶԣ�2��1�ȶԣ�����1��С�����Դ�ʱ��С����1.
            ��������1���±ȶԣ�1��5�ȶԣ�����1����С�ģ�����1������С�ġ�

            ����1������ߵ�3����λ�á�
       2 6 3 5
       ���裺
        ��һ��2����С�ġ�
        ...

      6 3 5
        ����6����С�ģ�
        6��3�ȶԣ�����3��С�����Դ�ʱ��С����3.
        ...
 */

package Chapter19.com.huawei.javaSE.array;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 6, 2, 10, 1 };
        // int[] arr = { 3, 1, 6, 2, 5};
        // int[] arr = { 9, 8, 10, 7, 6, 0, 11 };
        int count = 0;
        int count2 = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            // int min = arr[j];
            int min = j;
            for (int i = j + 1; i < arr.length; i++) {
                count++;
                // System.out.println(i);
                if (arr[min] > arr[i]) {
                    min = i;
                }
            }

            // ��ѭ����
            if (min != j) {
                int temp;
                temp = arr[min];
                arr[min] = arr[j];
                arr[j] = temp;
                count2++;

            }
            // System.out.print(arr[min] + " ");
        }
        printArray(arr);
        System.out.println("�Ƚϴ�����" + count);
        System.out.println("����������" + count2);
    }

    // �������
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // ��ֹ���һ�����ֶ����һ���ո�
            // if (i != arr.length - 1)
            //     System.out.print(arr[i] + " ");
            // else
            //     System.out.print(arr[i]);
            System.out.print(i != arr.length-1 ? arr[i] + " " : arr[i]);
        }
        System.out.println();
    }
}
