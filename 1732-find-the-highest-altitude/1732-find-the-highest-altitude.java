class Solution {
    public int largestAltitude(int[] gain) {
        int prefixGainPrev = 0;
        int maxPrefixGain = 0;
        for(int i = 0;i<gain.length;i++){
            prefixGainPrev = prefixGainPrev + gain[i];
            maxPrefixGain = Math.max(prefixGainPrev, maxPrefixGain);
        }
        return maxPrefixGain;
    }
}