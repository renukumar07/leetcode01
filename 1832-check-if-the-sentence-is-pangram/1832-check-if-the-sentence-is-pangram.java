class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(char c: sentence.toCharArray()){
            map.put(c,1);
        }
        return map.size()==26;
    }
}