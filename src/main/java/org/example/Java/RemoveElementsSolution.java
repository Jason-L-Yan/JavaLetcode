package org.example.Java;

/**
 * LeetCode 第27题
 */
public class RemoveElementsSolution {
    public int removeElement(int[] nums, int val) {
        return spaceReplaceTime(nums, val);
    }

    /**
     * 该方法用于移除数组中所有等于指定值的元素，并返回移除后数组中剩余元素的数量。
     * 使用数组中值替换的方法
     *
     * @param nums 输入的整数数组
     * @param val 需要移除的值
     * @return 移除指定值后数组中剩余元素的数量
     */
    private int spaceReplaceTime(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int count = 0;
        for (int num : nums) {
            if (num == val) {
                continue;
            }
            nums[count++] = num;
        }
        return count;
    }

    /**
     * 该方法用于移除数组中所有等于指定值的元素，并返回移除后数组中剩余元素的数量。
     * 使用双指针的方法
     *
     * @param nums 输入的整数数组
     * @param val 需要移除的值
     * @return 移除指定值后数组中剩余元素的数量
     */
    private int timeReplaceSpace(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
