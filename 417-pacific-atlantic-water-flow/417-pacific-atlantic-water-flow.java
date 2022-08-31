class Solution {
    public void dfs(int[][] heights, int i, int j, int prev, boolean[][] ocean){
        if(i<0 || i>=ocean.length || j<0 || j>=ocean[0].length){
            return;
        }
        if(heights[i][j]<prev || ocean[i][j]){
            return;
        }
        ocean[i][j] = true;
        dfs(heights, i,j+1, heights[i][j], ocean);
        dfs(heights, i,j-1, heights[i][j], ocean);
        dfs(heights, i+1,j, heights[i][j], ocean);
        dfs(heights, i-1,j, heights[i][j], ocean);
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        int row = heights.length, col = heights[0].length;
        boolean [][] pacific = new boolean[row][col];
        boolean [][] atlantic = new boolean[row][col];
        
        for(int i = 0;i<col;i++){
            dfs(heights, 0,i, Integer.MIN_VALUE, pacific);
            dfs(heights, row-1,i, Integer.MIN_VALUE, atlantic);
        }
        for(int i = 0;i<row;i++){
            dfs(heights, i,0, Integer.MIN_VALUE, pacific);
            dfs(heights, i,col-1, Integer.MIN_VALUE, atlantic);
        }
        
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
}