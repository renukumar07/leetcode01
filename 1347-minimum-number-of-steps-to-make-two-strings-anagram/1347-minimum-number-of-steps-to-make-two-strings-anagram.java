class Solution {
    public int minSteps(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for(Character ch: s.toCharArray()){
            sMap.put(ch, sMap.getOrDefault(ch, 0)+1);
        }
        for(Character ch: t.toCharArray()){
            tMap.put(ch, tMap.getOrDefault(ch, 0)+1);
        }
        int count = 0;
        for(Map.Entry<Character, Integer> entry: tMap.entrySet()){
            Character tKey = entry.getKey();
            Integer tValue = entry.getValue();
            if(sMap.containsKey(tKey)){
                Integer sValue = sMap.get(tKey);
                int diff = tValue - sValue;
                if(diff>0){
                    count+=diff;
                }
            }else{
                count+=tValue;
            }
        }
        return count;
    }
}