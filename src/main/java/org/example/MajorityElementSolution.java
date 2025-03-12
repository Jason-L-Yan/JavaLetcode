package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * LeetCode 第169题
 */
public class MajorityElementSolution {
    public int majorityElement(int[] nums) {
        return greedyMethodOne(nums);
    }

    /**
     * 方法一：优化点，方法可以插分
     *
     * @param nums
     * @return
     */
    private static int greedyMethodOne(int[] nums) {
        HashMap<Integer, Integer> numToTimes = new HashMap<>();
        for (int num : nums) {
            if (numToTimes.containsKey(num)) {
                Integer value = numToTimes.get(num);
                if (value + 1 > nums.length / 2) {
                    return num;
                }
                numToTimes.put(num, value + 1);
            } else {
                numToTimes.put(num, 1);
            }
        }
        return nums[0];
    }

    /**
     * 方法二：拆分方法，比较大小
     *
     * @param nums 数组
     * @return 返回最大的数值
     */
    private int greedyMethodTwo(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityMap = null;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : counts.entrySet()) {
            if (majorityMap == null || majorityMap.getValue() < integerIntegerEntry.getValue()) {
                majorityMap = integerIntegerEntry;
            }
        }
        return majorityMap.getKey();
    }

    private Map<Integer, Integer> countNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                continue;
            }
            map.put(num, 1);
        }
        return map;
    }

    /**
     * 方法三：找规律，中间的下标一定是众数
     *
     * @param nums 原数组
     * @return 返回众数
     */
    private int sampleMethod(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * 方法四：利用随机数找到一个元素进行判断
     *
     * @return 众数
     */
    private int randomMethod(int[] nums) {
        Random random = new Random();
        int majorityCount = nums.length / 2;
        while (true) {
            int candidate = nums[randomNum(random, 0, nums.length)];
            if (countOccurences(nums, candidate) > majorityCount) {
                return candidate;
            }
        }
    }

    private int randomNum(Random rand, int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private int countOccurences(int[] nums, int num) {
        int count = 0;
        for (int j : nums) {
            if (j == num) {
                count++;
            }
        }
        return count;
    }
}














