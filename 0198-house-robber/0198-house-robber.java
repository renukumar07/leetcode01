class Solution {
    int[] memo;
    private int rob(int[] nums, int length){
        if(length<0){
            return 0;
        }
        if(memo[length]>=0){
            return memo[length];
        }
        memo[length] = Math.max(rob(nums,length-2)+nums[length], rob(nums, length-1));
        return memo[length];
    }
    public int rob(int[] nums) {
        memo = new int[nums.length+1];
        Arrays.fill(memo, -1);
        return rob(nums, nums.length-1);
    }
}