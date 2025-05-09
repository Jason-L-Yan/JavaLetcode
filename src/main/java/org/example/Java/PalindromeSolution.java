package org.example.Java;

/**
 * Leetcode 第125题 回文字符串
 */
public class PalindromeSolution {
    public boolean isPalindrome(String s) {
        StringBuilder sGood = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sGood.append(Character.toLowerCase(ch));
            }
        }
        int start = 0;
        int end = sGood.length() - 1;
        while (start < end) {
            if (sGood.charAt(start) == sGood.charAt(end)) {
                start++;
                end--;
                continue;
            }
            return false;
        }
        return true;
    }

    private static boolean reverseString(String s) {
        StringBuilder sgood = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder reverse = new StringBuilder(sgood).reverse();
        return sgood.toString().equals(reverse.toString());
    }
}
