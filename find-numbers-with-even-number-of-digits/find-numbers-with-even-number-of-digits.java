class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(isNumContainEvenDigits(num)){
                count++;
            }
        }
        return count;
    }
    
    private boolean isNumContainEvenDigits(int num){      
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count%2==0;
    }
}