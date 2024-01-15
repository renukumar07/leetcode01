class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> winnerSet = new HashSet<>();
        Map<Integer, Integer> loserMap = new HashMap<>();
        
        for(int i = 0;i<matches.length;i++){
            int winner = matches[i][0];
            int loser = matches[i][1];
            winnerSet.add(winner);   
            
            loserMap.put(loser, loserMap.getOrDefault(loser, 0)+1);
                        
        }
        
        for(int i = 0;i<matches.length;i++){

            int loser = matches[i][1];

            if(winnerSet.contains(loser)){
                winnerSet.remove(loser);
            }

        }
        
        
        List<Integer> list1 = new ArrayList<>();
        
        for(int a: winnerSet){
            list1.add(a);
        }
        
        List<Integer> list2 = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry: loserMap.entrySet()){
            if(entry.getValue()==1){
                list2.add(entry.getKey());
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);
        return ans;
        
    }
}