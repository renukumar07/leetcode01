class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int[] arr = new int[26];
        for(char c: sentence.toCharArray()){
            arr[c-'a']+=1;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }
}