package org.example.Java;

/**
 * Leetcode 第11题，盛最多水容器
 */
public class MaxAreaSolution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = -1;
        while (start < end) {
            int areaWidth = end - start;
            int areaHeight = Math.min(height[start], height[end]);
            maxArea = Math.max(maxArea, areaHeight * areaWidth);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
