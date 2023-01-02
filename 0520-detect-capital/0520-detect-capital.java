class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        for(char c: word.toCharArray()){
            if(Character.isUpperCase(c)){
                upperCount++;
            }
        }
        if(upperCount == word.length()){
            return true;
        }
        int lowerCount = 0;
        for(char c: word.toCharArray()){
            if(Character.isLowerCase(c)){
                lowerCount++;
            }
        }
        if(lowerCount == word.length()){
            return true;
        }
        int count = 0;
        if(Character.isUpperCase(word.charAt(0))){
            for(int i = 1;i<word.length();i++){
                if(Character.isLowerCase(word.charAt(i))){
                    count++;
                }
            }
            if(count==word.length()-1){
                return true;
            }
        }
        return false;        
    }
}