class Solution {
    public void dfs(int n, int num, int k, List<Integer> resultList){
        if(n==0){
            resultList.add(num);
            return;
        }
        List<Integer> nextDigits = new ArrayList<>();
        int lastDigit = num%10;
        nextDigits.add(lastDigit+k);
        if(k!=0){
            nextDigits.add(lastDigit-k);
        }
        for(Integer nextDigit: nextDigits){
            if(0<=nextDigit && nextDigit<10){
                this.dfs(n-1, num*10+nextDigit,k,resultList);
            }
        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> resultList = new ArrayList<>();
        for(int num = 1; num<10;num++){
            this.dfs(n-1, num, k, resultList);
        }
        return resultList.stream().mapToInt(i->i).toArray();
    }
}