class Solution {
    public int numberOfBits(int i){
        int x = (int)(Math.log(i) / Math.log(2));
        return x+1;
    }
    public int concatenatedBinary(int n) {
        long res = 0;
        long MOD = (int)(1e9 + 7);
        for(int i = 1;i<=n;i++){
            int len = numberOfBits(i);
            res = ((res<<len)%MOD + i)%MOD;
        }
        return (int)res;
    }
}