class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();        
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j]==0){
                    xSet.add(i);
                    ySet.add(j);
                }
            }
        }
        for(int x: xSet){
            for(int i = 0;i<n;i++){
                matrix[x][i] = 0;
            }
        }
        for(int y: ySet){
            for(int i = 0;i<m;i++){
                matrix[i][y] = 0;
            }
        }
    }
}