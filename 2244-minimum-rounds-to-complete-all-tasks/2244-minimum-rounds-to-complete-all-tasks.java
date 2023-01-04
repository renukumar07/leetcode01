class Solution {
    public int minimumRounds(int[] tasks) {
        if(tasks.length <2)
            return -1;
        Map<Integer,Integer> map =  new HashMap<>();
        for(int i=0;i<tasks.length;i++) {
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int count=0;
        int res=0;
        for(int i : map.keySet()){
            count = map.get(i);
            if(count%3==0)
                res+=count/3;
            else if(count%3==1){
                if(count==1)
                    return -1;
                res+=((count/3)-1)+2;
            } else{
                res+=(count/3)+1;
            }
        }    
        return res;
    }
}