class Solution {
    private boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' ||c=='I' || c=='O' || c=='U')
            return true;
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int leftCount = 0;
        int rightCount = 0;
        for(int i = 0,j = s.length()/2;i<s.length()/2;i++,j++){
            if(isVowel(s.charAt(i))) leftCount++;
            if(isVowel(s.charAt(j))) rightCount++;
        }
        return leftCount==rightCount;
    }
}