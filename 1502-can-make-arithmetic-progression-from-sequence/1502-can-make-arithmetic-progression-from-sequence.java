class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);        
        for(int i = 1;i<arr.length-1;i++){            
            int pdiff = arr[i]-arr[i-1];
            int ndiff = arr[i+1]-arr[i];
            if(pdiff!=ndiff)
                return false;
        }
        return true;
    }
}