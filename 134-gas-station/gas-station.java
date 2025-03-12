class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i=0,j=0,cst=0,cnt=0,n=gas.length;

        while(i<n){
            cst+=(gas[j]-cost[j]);
            // System.out.print(cst+" ");
            j=(j+1)%n;
            cnt++;
            if(cst<0){
                if(j<=i){break;}
                i=j;cnt=0;cst=0;
                // System.out.print(i+" ");
            }else if(cnt==n){
                return i;
            }
    
        }

        return -1;
    }
}