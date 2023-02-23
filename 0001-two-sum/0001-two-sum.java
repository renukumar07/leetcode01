class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int j = map.get(target-nums[i]);
                if(i!=j)
                    return new int[]{i,j};
            }
        }
        return null;
    }
}