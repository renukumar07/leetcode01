class Solution {
    public int minDeletionSize(String[] strs) {
        int count = strs[0].length();
        for(int j = 0;j<strs[0].length();j++){
            for(int i = 0;i<strs.length-1;i++){
                if(strs[i].charAt(j)>strs[i+1].charAt(j)){
                    count--;
                    break;
                }
            }
        }
        return strs[0].length() - count;
    }
}