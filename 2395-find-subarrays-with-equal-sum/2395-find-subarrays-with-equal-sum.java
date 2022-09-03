class Solution {
    public boolean findSubarrays(int[] nums) {
        int[] subSum = new int[nums.length];
        subSum[0] = Integer.MIN_VALUE;
        for(int i = 1;i<nums.length;i++){
            subSum[i] = nums[i-1] + nums[i];
        }
        Arrays.sort(subSum);
        for(int i = 2;i<subSum.length;i++){
            if(subSum[i]==subSum[i-1]){
                return true;
            }
        }
        return false;
    }
}