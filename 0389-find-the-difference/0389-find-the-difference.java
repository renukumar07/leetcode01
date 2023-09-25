class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(sMap.containsKey(ch)){
                sMap.put(ch, sMap.get(ch)+1);
            }else{
                sMap.put(ch, 1);
            }
        }
        
        Map<Character, Integer> tMap = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(tMap.containsKey(ch)){
                tMap.put(ch, tMap.get(ch)+1);
            }else{
                tMap.put(ch, 1);
            }
        }
        
        for(int i = 0;i<t.length();i++){
            if(sMap.containsKey(t.charAt(i))){
                int num = sMap.get(t.charAt(i));
                if(num==1){
                    sMap.remove(t.charAt(i));
                }else{
                    sMap.put(t.charAt(i), num-1);
                }
            }else{
                return t.charAt(i);
            }
        }
        return 'c';
    }
}