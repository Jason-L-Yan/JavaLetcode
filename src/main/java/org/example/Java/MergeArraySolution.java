package org.example.Java;

import java.util.Arrays;

/**
 * LeetCode 第88题
 */
public class MergeArraySolution {
    /**
     * Merges two sorted arrays into one sorted array.
     * The method overwrites the original array nums1 with the merged result.
     *
     * @param nums1 The first sorted array, with a length sufficient to hold the elements of nums1 and nums2.
     * @param m     The number of initialized elements in nums1.
     * @param nums2 The second sorted array.
     * @param n     The number of initialized elements in nums2.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Call another method to perform the actual merge operation
        solutionThree(nums1, m, nums2, n);
    }

    private static void solutionOne(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
            return;
        }
        int count = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[count++];
        }
        Arrays.sort(nums1);
    }

    private static void solutionTwo(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    private static void solutionThree(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            nums1[p--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }

}
