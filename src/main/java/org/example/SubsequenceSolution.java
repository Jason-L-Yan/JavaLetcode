package org.example;

/**
 * Leetcode 第392题，判断子序列
 */
public class SubsequenceSolution {
    /**
     * 判断字符串s是否为字符串t的子序列
     * 子序列指的是可以通过删除某些字符（也可以不删除）后，不改变字符的相对位置，得到的新字符串
     *
     * @param s 需要判断的子序列字符串
     * @param t 被判断的母序列字符串
     * @return 如果s是t的子序列，返回true；否则返回false
     */
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}
