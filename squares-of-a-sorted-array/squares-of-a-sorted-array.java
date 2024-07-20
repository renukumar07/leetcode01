class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int length = nums.length;
        int right = length-1;
        int[] ans = new int[length];
        for(int i = length-1;i>=0;i--){
            int leftSquared = nums[left]*nums[left];
            int rightSquared = nums[right]*nums[right];
            if(leftSquared>rightSquared){
                ans[i] = leftSquared;
                left++;
            }else{
                ans[i] = rightSquared;
                right--;
            }            
        }
        return ans;
    }
}