class Solution {
    public boolean checkAllElementsInSet(Set<Integer> set){
        int k = 1;
        for(int a: set){
            if(a != k){
                return false;
            }
            k++;
        }
        return true;
    }
    public boolean checkValid(int[][] matrix) {
        boolean row = false, col = false;
        Set<Integer> set = null;
        for(int i = 0;i<matrix.length;i++){
            set = new HashSet<>();
            for(int j = 0;j<matrix[0].length;j++){
                set.add(matrix[i][j]);
            }
            if(set.size()!=matrix.length){
                return false;
            }
            row = checkAllElementsInSet(set);
            if(row==false){
                return false;
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
            col = checkAllElementsInSet(set);
            if(col==false){
                return false;
            }
        }
        return row & col;
    }
}