class Solution {
    public int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE, cur = 0;
        for(int i = 0; i < nums.length; i++){
            if(cur < 0){
                cur = 0;
            }
            cur += nums[i];
            max = Math.max(max, cur);
        }
        return max;
    }
    // dp

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length]; // largest sum ending with A[i];
        dp[0] = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = dp[i-1]>=0? dp[i-1]+nums[i] : nums[i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}