/*
选择排序：
    每一次从这堆“参与比较的数据当中”找出最小值，
    拿着这个最小值和“参与比较的这堆最前面的元素”交换位置。

    选择排序比冒泡排序好在：每一次的交换位置都是有意义的。

    关键点：选择排序中的关键在于，你怎么找出一堆数据中最小的。
        3 2 6 1 5
        假设：
            第一个3是最小的。
            3和2比较，发现2更小，所以此时最小的是2.

            继续拿着2往下比对，2和6比较，2仍然是最小的。
            继续拿着2往下比对，2和1比对，发现1更小，所以此时最小的是1.
            继续拿着1往下比对，1和5比对，发现1还是小的，所以1就是最小的。

            拿着1和最左边的3交换位置。
       2 6 3 5
       假设：
        第一个2是最小的。
        ...

      6 3 5
        假设6是最小的：
        6和3比对，发现3更小，所以此时最小的是3.
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

            // 内循环外
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
        System.out.println("比较次数：" + count);
        System.out.println("交换次数：" + count2);
    }

    // 输出数组
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 防止最后一个数字多输出一个空格。
            // if (i != arr.length - 1)
            //     System.out.print(arr[i] + " ");
            // else
            //     System.out.print(arr[i]);
            System.out.print(i != arr.length-1 ? arr[i] + " " : arr[i]);
        }
        System.out.println();
    }
}
