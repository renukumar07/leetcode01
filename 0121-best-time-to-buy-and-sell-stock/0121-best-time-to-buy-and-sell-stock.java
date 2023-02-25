class Solution {
    public int maxProfit(int[] prices) {
        int start = prices[0];
        int diff = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i]<start){
                start = prices[i];
            }else{
                diff = Math.max(diff, prices[i] - start);
            }
        }
        return diff;
    }
}