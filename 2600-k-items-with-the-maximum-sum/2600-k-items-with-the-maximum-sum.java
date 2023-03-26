class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes)
            return k;
        if(k<=numOnes+numZeros)
            return numOnes;
        return 2*numOnes + numZeros - k;
    }
}