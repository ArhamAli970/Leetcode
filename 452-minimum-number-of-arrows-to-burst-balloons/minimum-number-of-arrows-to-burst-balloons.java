class Solution {
    public int findMinArrowShots(int[][] points) {
             Arrays.sort(points,(a,b)->a[0]-b[0]);

        int st=points[0][0];
        int end=points[0][1];
         int cntMinArrow=0;
        for(int i=1;i<points.length;i++){ 
            st=Math.max(st,points[i][0]);
            end=Math.min(end,points[i][1]);

            if(st>end){ 
               cntMinArrow++;
               st=points[i][0];
               end=points[i][1];
            }

        }

return cntMinArrow+1;  
    }
}