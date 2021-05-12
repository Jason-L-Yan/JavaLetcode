/*
1、数组工具类：自己写的。不是SUN的。

2、关于查找算法中的：二分法查找。
    10(下标0) 11 12 13 14 15 16 17 18 19 20(下标10)   arr数组。

    通过二分法查找，找出18这个元素的下标：
        (0 + 10) / 2 --> 中间元素的下标： 5

    拿着中间这个元素和目标要查找的元素进行对比：
        中间元素是：arr[5] --> 15
        15 < 18(被查找的元素)
        被查找的元素18在目前中间元素15的右边。
        所以开始元素的下标从0变成 5 + 1.

    再重新计算一个中间元素的下标：
        开始下标是：5 + 1
        结束下标是：10
        (6 + 10) / 2 --> 8

    8下标对应的元素arr[8]是18
        找到的中间元素正好和被找的的元素18相等，表示找到了：下标为8

    二分法查找的终止条件：一直折半，直到中间的那个元素恰好是被查找的元素。

3、二分法查找算法是基于排序的基础之上。（没有排序的数据是无法查找的。）

 */
package com.huawei.javaSE.array;

public class ArraySearch2 {
    public static void main(String[] args) {
        int[] array = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        for (int i = 10; i < 23; i++) {
            int index = binarySearch(array, i);
            System.out.println("元素" + i + "的索引：" + (index == -1 ? "该元素不存在" : "该元素下标是：" + index));
        }
    }

    /**
     * 从数组中检索某个元素的下标
     * @param array 被查找的数组
     * @param i 目标元素
     * @return 返回大于等于0的数表示下标，否则返回-1，表示元素不存在。
     */
    private static int binarySearch(int[] array, int i) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (int) (low + (high - low) / 2);
            if (array[mid] > i) {
                high = mid - 1;
            } else if (array[mid] < i) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
