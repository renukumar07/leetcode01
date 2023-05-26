class Solution {
    public boolean isPalindrome(int x) {
        if(x==0)
            return true;
        if(x<0 || x%10==0)
            return false;
        int secondHalf = 0;
        int firstHalf = x;
        while(secondHalf<firstHalf){
            int num = firstHalf%10;
            secondHalf = (secondHalf*10) + num;
            firstHalf = firstHalf/10;
        }
        System.out.println("s = "+secondHalf);
        System.out.println("f = "+firstHalf);
        if(secondHalf/10 == firstHalf || secondHalf == firstHalf)
            return true;
        return false;
    }
}