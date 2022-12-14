class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        int temp = 0;
        for(int i = 0;i<nums.length;i++){
            temp = prev1;
            prev1 = Math.max(prev2 + nums[i], prev1);
            prev2 = temp;
        }
        return prev1;
    }
}