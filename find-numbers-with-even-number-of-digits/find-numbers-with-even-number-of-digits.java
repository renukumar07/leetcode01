class Solution {
    
    private int noOfDigits(int num){        
        int count = 0;
        while(num>0){            
            num=num/10;
            count++;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int i = 0;i<nums.length;i++){
            if(noOfDigits(nums[i])%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}