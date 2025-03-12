package org.example;

/**
 * LeetCode 第80题
 * 该类提供了一个方法，用于移除排序数组中的重复项，使得每个元素最多出现两次。
 */
public class SameLocationRemoveSolution {
    /**
     * 移除排序数组中的重复项，使得每个元素最多出现两次。
     *
     * @param nums 输入的排序整数数组
     * @return 移除重复项后的数组长度
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length <= 2) {
            return nums.length;
        }
        int stackSize = 2;
        for (int i = 2; i < nums.length; i++) {
            // 与栈顶下方的元素比较。如果相同就有可能三个值相同。
            if (nums[i] != nums[stackSize - 2]) {
                nums[stackSize++] = nums[i];
            }
        }
        return stackSize;
    }
}
