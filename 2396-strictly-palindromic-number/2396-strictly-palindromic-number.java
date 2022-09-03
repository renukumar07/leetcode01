class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int rem = 0;
        for(int i = 2;i<=n-2;i++){
            int num = n;
            List<Integer> list = new ArrayList<>();
            while(num!=0){
                rem = num%i;
                num = num/i;
                list.add(rem);
            }
            int start = 0;
            int end = list.size()-1;
            for(int j = 0;j<list.size()/2;j++){
                if(list.get(start) != list.get(end)){
                    return false;
                }                
            }
        }
        return true;
    }
}