class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squaredArray = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            squaredArray[i] = nums[i]*nums[i];
        }
        Arrays.sort(squaredArray);
        return squaredArray;
    }
}