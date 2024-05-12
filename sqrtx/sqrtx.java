class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int ans = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            int sq = mid*mid;
            if(mid == x/mid){
                return mid;
            }else if(mid<x/mid){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}