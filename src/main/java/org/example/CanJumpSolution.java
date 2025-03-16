package org.example;

/**
 * Leetcode 第55题, 跳跃游戏
 */
public class CanJumpSolution {
    /**
     * 可以跳到尾部吗？
     *
     * @param nums 位置数组
     * @return 是否能够
     */
    public boolean canJump(int[] nums) {
        int last = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= last) {
                last = i;
            }
        }
        return last == 0;
    }

    private static boolean jumpOne(int[] nums) {
        if (nums == null) {
            return false;
        }
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reach) {
                return false;
            }
            reach = Math.max(i + nums[i], reach);
        }
        return true;
    }
}
