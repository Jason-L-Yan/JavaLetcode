package org.example;

/**
 * LeetCode 第26题
 */
public class RemoveSortedElementSolution {
    /**
     * 移除排序数组中的重复元素，并返回移除后数组的新长度
     *
     * @param nums 输入的排序数组
     * @return 移除重复元素后数组的新长度
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 1;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
