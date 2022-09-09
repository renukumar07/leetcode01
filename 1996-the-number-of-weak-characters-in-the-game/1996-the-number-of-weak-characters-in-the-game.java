class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int result = 0;
        Arrays.sort(properties,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        int max = Integer.MIN_VALUE;
        int len = properties.length;
        for(int i = len-1;i>=0;i--){
            int attack = properties[i][0];
            int defence = properties[i][1];
            if(defence<max){
                result++;
            }
            max = Math.max(max, defence);
        }
        return result;
    }
}