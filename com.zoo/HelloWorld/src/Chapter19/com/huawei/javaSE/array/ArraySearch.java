/*
数组的元素查找
    数组元素查找有两种方式：
        第一种方式：一个一个挨着找，直到找到为止。
        第二种方式：二分法查找（算法），这个效率较高。
 */

package Chapter19.com.huawei.javaSE.array;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 5, 87, 8, 9, 7, 0 };
        int index = arraySearch(arr, 8);
        // if (index != -1)
        // System.out.println(index);
        // else
        // System.out.println("该元素不存在");
        
        // 三目运算符输出。
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标是：" + index);
    }

    /**
     * 从数组中检索某个元素的下标
     * @param arr 被检索的数组
     * @param destination 被检索的元素
     * @return 返回大于等于0的数表示下标，否则返回-1，表示元素不存在。
     */
    private static int arraySearch(int[] arr, int destination) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == destination) {
                return i;
            }
        }
        return -1;
    }

}
