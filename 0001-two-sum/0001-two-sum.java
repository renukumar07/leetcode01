class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            if(map.containsKey(target-num)){
                int targetIndex = map.get(target-num);
                return new int[]{i,targetIndex};
            }else{
                map.put(num,i);
            }
        }
        return new int[]{-1,-1};
    }
}