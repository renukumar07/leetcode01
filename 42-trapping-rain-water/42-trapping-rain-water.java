class Solution {
    public int trap(int[] height) {       
        int i = 1;
        int j = height.length-2;
        int maxLeft = height[i-1];
        int maxRight = height[j+1];
        int sum = 0;
        while(i<=j){
            if(maxLeft<=maxRight){
                if(maxLeft>height[i]){
                    sum+=maxLeft-height[i];
                }                
                maxLeft = Math.max(maxLeft,height[i]);
                i++;
            }else{
                if(maxRight>height[j]){
                    sum+=maxRight-height[j];
                }
                maxRight = Math.max(maxRight,height[j]);
                j--;
            }
        }
        return sum;
    }
}