class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] pf = new int[26];
        int[] sf = new int[26];
        for(char c: p.toCharArray()){
            pf[c-'a'] = pf[c-'a']+1;
        }
        for(int i = 0;i<s.length();i++){
            if(i>p.length()-1){
                char ch = s.charAt(i-p.length());
                sf[ch-'a'] = sf[ch-'a']-1;
            }
            char c = s.charAt(i);
            sf[c-'a'] = sf[c-'a'] + 1;
            boolean isEqual = isTwoFrequencyMapEqual(pf, sf);
            if(isEqual){
                list.add(i-p.length()+1);
            }
        }
        return list;
    }
    
    private boolean isTwoFrequencyMapEqual(int[] pf, int[] sf){
        for(int i = 0;i<26;i++){
            if(pf[i]!=sf[i]){
                return false;
            }
        }
        return true;
    }
}