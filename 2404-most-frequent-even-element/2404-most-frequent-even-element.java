class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }else{
                    map.put(nums[i],1);
                }
            }
        }
        int minElement = -1;
        int maxFrequency = -1;
        int val = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                val = map.get(nums[i]);
 
                if(val>maxFrequency){
                    maxFrequency = val;
                    minElement = nums[i];
                }
                if(val==maxFrequency && nums[i]<minElement){
                    minElement = nums[i];
                }
            }
        }
        return minElement;
    }
}