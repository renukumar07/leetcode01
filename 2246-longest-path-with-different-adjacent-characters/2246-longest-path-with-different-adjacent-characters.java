class Solution {
    int maxLongestPath = 0;
    public int longestPath(int[] parent, String s) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = parent.length;
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=1; i<n; i++){
            int nodeParent = parent[i];
            adj.get(nodeParent).add(i);
        }
        dfs(adj,0,s);
        return maxLongestPath;
    }
    private int dfs(ArrayList<ArrayList<Integer>> adj, int u,String s){
        int n = adj.get(u).size();
        int firstLongest = 0;
        int secondLongest = 0;
        for(int i=0; i<n; i++){
            int v = adj.get(u).get(i);
            int pathLength = dfs(adj,v,s);
            if(s.charAt(u)!=s.charAt(v)){
                if(firstLongest < pathLength){
                    secondLongest = firstLongest;
                    firstLongest = pathLength;
                }
                else if(secondLongest < pathLength){
                    secondLongest = pathLength;
                }
            }
        }
        
        maxLongestPath = Math.max(maxLongestPath,firstLongest+secondLongest+1);
        return firstLongest+1;
    }
}