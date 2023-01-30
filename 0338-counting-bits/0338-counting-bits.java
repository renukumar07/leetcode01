class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        for(int i = 0;i<=n;i++){
            if(i <= 1){
                dp[i] = i;
            }else{
                dp[i] = dp[i/2] + i%2;
            }            
        }
        return dp;
    }
}