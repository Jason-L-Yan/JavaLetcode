package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode 第150题
 */
public class TwoSumSolution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            if (numbers[right] + numbers[left] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[right] + numbers[left] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    private static int[] getInts(int[] numbers, int target) {
        // 检查输入数组是否合法
        if (numbers == null || numbers.length < 2) {
            return new int[0]; // 返回空数组表示无解
        }

        // 使用哈希表优化查找过程
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (numToIndex.containsKey(complement)) {
                // 找到符合条件的两个数
                return new int[] { numToIndex.get(complement) + 1, i + 1 };
            }
            // 将当前数及其索引存入哈希表
            numToIndex.put(numbers[i], i);
        }

        // 如果没有找到符合条件的两个数，返回空数组
        return new int[0];
    }
}
