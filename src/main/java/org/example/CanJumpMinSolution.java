package org.example;

/**
 * Leetcode 第45题 跳跃游戏二
 */
public class CanJumpMinSolution {
    public int jump(int[] nums) {
        int end = 0;
        int step = 0;
        int maxPosition = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(i + nums[i], maxPosition);
            if (i == end) {
                end = maxPosition;
                step++;
            }
        }
        return step;
    }

    private static int minJumpOne(int[] nums) {
        int position = nums.length - 1;
        int step = 0;
        while (position > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    step++;
                    break;
                }
            }
        }
        return step;
    }
}
