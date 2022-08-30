class Solution {
    public boolean checkValid(int[][] matrix) {
        Set<Integer> set = null;
        for(int i = 0;i<matrix.length;i++){
            set = new HashSet<>();
            for(int j = 0;j<matrix[0].length;j++){
                set.add(matrix[i][j]);
            }
            if(set.size()!=matrix.length){
                return false;
            }
            int k = 1;
            for(int a: set){
                if(a != k){
                    return false;
                }
                k++;
            }
        }
        for(int i = 0;i<matrix.length;i++){
            set = new HashSet<>();
            for(int j = 0;j<matrix[0].length;j++){
                set.add(matrix[j][i]);
            }
            if(set.size()!=matrix.length){
                return false;
            }
            int k = 1;
            for(int a: set){
                if(a != k){
                    return false;
                }
                k++;
            }
        }
        return true;
    }
}