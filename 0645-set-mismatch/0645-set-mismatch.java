class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] result = new int[2];
        for(int i = 1;i<=nums.length;i++){
            if(map.containsKey(i)){
                int val = map.get(i);
                if(val>1){
                    result[0] = i;
                }
            }else{
                result[1] = i;
            }
        }
        return result;
    }
}