class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int[][] ageScorePair = new int[ages.length][2];
        for(int i = 0;i<ages.length;i++){
            ageScorePair[i][0] = ages[i];
            ageScorePair[i][1] = scores[i];
        }
        Arrays.sort(ageScorePair, (a,b)->a[0]==b[0]? a[1]-b[1]:a[0]-b[0]);
        Integer[][] dp = new Integer[ages.length][ages.length];
        return findMaxScore(ageScorePair, dp, -1, 0);
    }
    private int findMaxScore(int[][] ageScorePair, Integer[][] dp, int prev, int index){
        if(index>=ageScorePair.length){
            return 0;
        }
        if(dp[prev+1][index]!=null){
            return dp[prev+1][index];
        }
        
        if(prev == -1 || ageScorePair[index][1] >= ageScorePair[prev][1]){
            dp[prev+1][index] = Math.max(findMaxScore(ageScorePair, dp, prev, index+1), ageScorePair[index]                              [1]+findMaxScore(ageScorePair, dp, index, index+1));
        }else{
            dp[prev+1][index] = findMaxScore(ageScorePair, dp, prev, index+1);
        }        
        return dp[prev+1][index];
    }
}