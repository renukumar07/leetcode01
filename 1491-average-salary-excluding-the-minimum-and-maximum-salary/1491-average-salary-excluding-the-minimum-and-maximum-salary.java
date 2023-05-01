class Solution {
    public double average(int[] salary) {
        int min = Arrays.stream(salary).min().getAsInt();
        int max = Arrays.stream(salary).max().getAsInt();
        System.out.println("min = "+min);
        System.out.println("max = "+max);
        double sum = (double)Arrays.stream(salary).sum();
        double d = (sum - min - max)/(salary.length-2);
        return d;
    }
}