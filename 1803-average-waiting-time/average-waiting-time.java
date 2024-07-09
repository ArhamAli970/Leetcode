class Solution {
    public double averageWaitingTime(int[][] customers) {

        double wait=0;
        int currTime=customers[0][0];
        int n=customers.length;

        for(int i=0;i<n;i++){
            
            currTime=customers[i][0]>=currTime?customers[i][0]:currTime;
            currTime+=customers[i][1];
            wait+=(currTime-customers[i][0]);


        }


        wait/=(n*1.0);

return wait;
        
    }
}