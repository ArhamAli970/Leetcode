class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        int totTime=0;

        for(int i=1;i<points.length;i++){ 
            int X=Math.abs(points[i][0]-points[i-1][0]);
            int Y=Math.abs(points[i][1]-points[i-1][1]);
            
            totTime=totTime+Math.min(X,Y)+Math.max(X,Y)-Math.min(X,Y);


        }

        return totTime;

    }
}