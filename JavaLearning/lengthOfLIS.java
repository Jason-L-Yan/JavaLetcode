package JavaLearning;

import java.util.Arrays;

public class lengthOfLIS{
    public static void main(String[] args){
        int [] nums = new int[]{186, 186, 150, 200, 160, 130, 197, 200, 201};
        Solution s = new Solution();
        System.out.println(s.lengthOfLIS(nums));
    }
    
}
// 时间复杂度是 O(n*n)
class Solution{
    public int lengthOfLIS(int[] nums){
        int[] dp = new int[nums.length];
        int res = 1;
        Arrays.fill(dp, 1);
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
