package org.example;

public class LoopArraySolution {
    public void rotate(int[] nums, int k) {
        if (nums.length <= 1) {
            return;
        }
        int index = nums.length - k % nums.length;
        int[] temp = new int[nums.length];
        int count = 0;
        for (int i = index; i < nums.length; i++) {
            temp[count++] = nums[i];
        }
        for (int j = 0; j < index; j++) {
            temp[count++] = nums[j];
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }
}
