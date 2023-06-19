class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefixGain = new int[gain.length+1];
        prefixGain[0] = 0;
        int maxPrefixGain = 0;
        for(int i = 1;i<prefixGain.length;i++){
            prefixGain[i] = prefixGain[i-1] + gain[i-1];
            maxPrefixGain = Math.max(prefixGain[i], maxPrefixGain);
        }
        return maxPrefixGain;
    }
}