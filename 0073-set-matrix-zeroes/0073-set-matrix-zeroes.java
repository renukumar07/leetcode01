class Solution {
    class XY{
        int x;
        int y;
        XY(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public void setZeroes(int[][] matrix) {
        List<XY> xyList = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j]==0){
                    xyList.add(new XY(i, j));
                }
            }
        }
        for(XY xy: xyList){
            int x = xy.x;
            int y = xy.y;
            for(int i = 0;i<n;i++){
                matrix[x][i] = 0;
            }
            for(int i = 0;i<m;i++){
                matrix[i][y] = 0;
            }
        }
    }
}