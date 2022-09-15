class Solution {
    public int[] findOriginalArray(int[] changed) {
        int changedLength = changed.length;
        Arrays.sort(changed);
        if(changedLength%2!=0){
            return new int[0];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: changed){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);                
            }
        }
        int val = 0;
        List<Integer> ans = new ArrayList<>();
        for(int num: changed){
            if(map.containsKey(num) && !map.containsKey(num*2)){
                return new int[0];
            }
            if(map.containsKey(num) && map.containsKey(num*2)){
                val = map.get(num);
                val--;
                map.put(num,val);
                if(val==0){
                    map.remove(num);
                }
                ans.add(num);
                if(map.containsKey(num*2)){
                    val = map.get(num*2);
                    val--;
                    map.put(num*2,val);
                    if(val==0){
                        map.remove(num*2);
                    }
                }else{
                    return new int[0];
                }
            }
        }
        int[] finalAns = new int[ans.size()];
        for(int i = 0;i<ans.size();i++){
            finalAns[i] = ans.get(i);
        }
        return finalAns;
    }
}