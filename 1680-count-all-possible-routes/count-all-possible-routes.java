class Solution {
    static long dp[][];
    static int md=1000000007;


public static long call(int[] locations, int start, int finish, int fuel,int i){
    if(fuel<0){return 0;}

    if(dp[start][fuel]!=-1){return dp[start][fuel];}

    long sum=0;
    if(start==finish){++sum;}

    for(int j=0;j<locations.length;j++){
        if(j==start){continue;}
       sum=(sum+ call(locations,j,finish,fuel-Math.abs(locations[j]-locations[start]),i+1))%md;
    }

    dp[start][fuel]=sum;
    // if(start==finish){dp[i][fuel];}
    return dp[start][fuel];
}

    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        dp=new long[locations.length+1][fuel+1];
        for(long i[]:dp){
            Arrays.fill(i,-1);
        }
        return (int)call(locations,start,finish,fuel,0);

    }
}