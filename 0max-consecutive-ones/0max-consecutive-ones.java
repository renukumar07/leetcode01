class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int onesCount = 0;
        int maxOnesCount = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                onesCount = onesCount + 1;
            }else{
                if(onesCount > maxOnesCount){
                    maxOnesCount = onesCount;                    
                }
                onesCount = 0;
            }
        }
        if(onesCount > maxOnesCount){
            maxOnesCount = onesCount;
            onesCount = 0;
        }
        return maxOnesCount;
    }
}