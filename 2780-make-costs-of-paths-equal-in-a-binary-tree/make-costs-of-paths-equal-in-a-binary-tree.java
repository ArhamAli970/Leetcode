class Solution {
    static int cnt;
    public static int call(int cost[],int i,int n){ 
       
       if((2*i+1)>=n){ 
           return cost[i];
       }

       int left=call(cost,2*i+1,n);
       int right=call(cost,2*i+2,n);

       int diff=Math.max(left,right)-Math.min(left,right);
       cnt+=diff;

       return Math.max(left,right)+cost[i];


    }


    public int minIncrements(int n, int[] cost) {
        cnt=0;
        call(cost,0,n);
        return cnt;

    }
}