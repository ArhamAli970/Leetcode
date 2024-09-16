class Solution {


    public int findMinDifference(List<String> timePoints) {

        Collections.sort(timePoints);
        int n=timePoints.size();
        int minTime=Integer.MAX_VALUE;
       

        for(int i=0;i<n;i++){
            String curr[]=timePoints.get(i).split(":");
            String prev[]=timePoints.get((n+i-1)%n).split(":");

            int hours=Integer.parseInt(curr[0])-Integer.parseInt(prev[0]);
            int mins=Integer.parseInt(curr[1])-Integer.parseInt(prev[1]);

            if(i==0){hours+=24;}

            int minutes=hours*60;
            // minutes+=mins>0?mins:0-mins;
            minutes+=mins;
            minTime=Math.min(minTime,minutes);

        }




return minTime;

    }
}