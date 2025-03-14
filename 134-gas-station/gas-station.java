class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length,sum=0,ind=-1,s=0;
        for(int i=0;i<n;i++){
            s+=(gas[i]-cost[i]);
            sum+=(gas[i]-cost[i]);
            if(sum<0){ind=-1;sum=0;}
            else if(ind==-1){ind=i;}
        }

        return s<0?-1:ind;
    }
}