class Solution {

static int dp[][][];

public static int call(int jobDifficulty[],int d,int i,int max){
    if(i>=jobDifficulty.length ){return d>0 ?Integer.MAX_VALUE/2:0;}
    if(d<=0){return Integer.MAX_VALUE/4;}
    int m=jobDifficulty[i];

    m=Math.max(m,max);
    if(dp[i][m][d]!=-1){ return dp[i][m][d];}

    
    int sameDay=call(jobDifficulty,d,i+1,m);
    int DiffDay=call(jobDifficulty,d-1,i+1,-1)+m;

    dp[i][m][d]=Math.min(sameDay,DiffDay);

    return dp[i][m][d];

}




    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
        int max=0;
        for(int i=0;i<n;i++){ 
            max=Math.max(max,jobDifficulty[i]);
        }

        dp= new int[n+1][max+1][d+1];

        for(int i=0;i<=n;i++){ 
            for(int j=0;j<=max;j++){ 
                for(int k=0;k<=d;k++){ 
                    dp[i][j][k]=-1;
                }
            }
        }
    
    int val= call(jobDifficulty,d,0,0);

    return val>=Integer.MAX_VALUE/2?-1:val;


    }
}