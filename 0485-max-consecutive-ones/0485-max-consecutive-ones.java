class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for(int num: nums){
            if(num==1){
                count++;
            }else{
                maxCount = Math.max(count,maxCount);
                count=0;
            }
        }
        return Math.max(count,maxCount);
    }
}