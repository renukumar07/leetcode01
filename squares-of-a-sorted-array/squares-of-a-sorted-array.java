class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int index = nums.length-1;
        while(start<=end){
            int startSquare = nums[start]*nums[start];
            int endSquare = nums[end]*nums[end];
            if(startSquare>endSquare){
                result[index] = startSquare;
                start++;
                index--;
            }else{
                result[index] = endSquare;
                end--;
                index--;
            }
        }
        return result;
    }
}