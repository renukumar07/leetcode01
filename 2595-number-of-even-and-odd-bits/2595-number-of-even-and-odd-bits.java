class Solution {
    public int[] evenOddBit(int n) {
        int index = 0;
        int rem = 0;
        int even = 0;
        int odd = 0;
        while(n>0){
            rem = n%2;
            n = n/2;
            if(rem==1){
                if(index%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            index++;
        }
        return new int[]{even,odd};
    }
}