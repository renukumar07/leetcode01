class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        int[] memo = new int[nums.length+1];
        memo[0] = 0;
        memo[1] = nums[0];
        for(int i = 1;i<nums.length;i++){
            memo[i+1] = Math.max(memo[i], memo[i-1]+nums[i]);
        }
        return memo[nums.length];
    }
}