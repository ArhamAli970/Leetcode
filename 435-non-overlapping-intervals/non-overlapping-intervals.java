class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
     Arrays.sort(intervals,(a,b) ->a[1]-b[1]);

     int cnt=0;
     int st=Integer.MIN_VALUE;

     for(int i=0;i<intervals.length;i++){ 
         if(st<=intervals[i][0]){
            st=intervals[i][1];
         }else{
            // System.out.print(i+" "+st);
            cnt++;
         }
     }

return cnt;



    }
}