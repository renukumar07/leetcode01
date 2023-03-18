class Solution {
    public int lengthOfLastWord(String s) {
        int start = 0;
        int count = 0;
        int flag = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(flag==0 && s.charAt(i)==' '){
                continue;
            }
            if(s.charAt(i)!=' '){
                count++;
                flag = 1;                    
            }else{
                return count;
            }
        }
        return count;
    }
}