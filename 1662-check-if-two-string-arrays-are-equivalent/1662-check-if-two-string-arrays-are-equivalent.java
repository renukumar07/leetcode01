class Solution {
    private String concatenateElements(String[] words){
        StringBuilder sb = new StringBuilder();
        for(String s: words){
            sb.append(s);
        }
        return sb.toString();
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return concatenateElements(word1).equals(concatenateElements(word2));
    }
}