class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length){
            return nums;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n:nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        
        Queue<Integer> priorityQueue = new PriorityQueue<>((m, n) -> map.get(m) - map.get(n));
        
        for(int n: map.keySet()){
            priorityQueue.add(n);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        
        int[] top = new int[k];
        for(int i = k-1;i>=0;i--){
            top[i] = priorityQueue.poll();
        }
        
        return top;
        
    }
}