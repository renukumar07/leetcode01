class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasAmount=0;
        int totalCost=0;
        int current=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
           gasAmount+=gas[i];
           totalCost+=cost[i];
        }
        if(gasAmount<totalCost){
            return -1;
        }
        for(int i=0;i<gas.length;i++){
           current+=(gas[i]-cost[i]);
           if(current<0){
               start=i+1;
               current=0;
           }
           
        }
        
        return start;
    }
}