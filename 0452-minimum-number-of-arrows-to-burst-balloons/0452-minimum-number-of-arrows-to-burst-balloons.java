class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,new Comparator<int []>(){
            public int compare(int [] frst,int [] scnd){
                if(frst[1]>scnd[1]) return 1;
                else return -1;
            }
        });
        int count=1,point=points[0][1];
        for(int i=0;i<points.length;i++){
            if(points[i][0]<=point) continue;
            point=points[i][1];
            count++;
        }
        return count;
    }
}