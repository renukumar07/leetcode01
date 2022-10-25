class Solution {
    private String concatenateElements(String[] words){
        StringBuilder sb = new StringBuilder();
        for(String s: words){
            sb.append(s);
        }
        return sb.toString();
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = concatenateElements(word1);
        String s2 = concatenateElements(word2);
        return s1.equals(s2);
    }
}