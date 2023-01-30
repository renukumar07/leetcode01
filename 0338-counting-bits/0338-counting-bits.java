class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i = 0;i<=n;i++){
            result[i] = noOfBits(i);
        }
        return result;
    }
    private int noOfBits(int i){
        int count = 0;
        while(i>0){
            if(i%2!=0){
                count++;
            }
            i = i/2;
        }
        return count;
    }
}