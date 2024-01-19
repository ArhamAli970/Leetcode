class Solution {
    static int dp[][];

public static int dfs(int i,int j,int [][] mat){ 
    if(i==mat.length){ 
        return 0;
    }  
    if(j<0 || j>=mat.length){return 10000000;}
    

    if(dp[i][j]!=-1000000){ 
        return dp[i][j];
    }
    
    
    int left=dfs(i+1,j-1,mat);
    int right=dfs(i+1,j+1,mat);
    int mid=dfs(i+1,j,mat);

    dp[i][j]=mat[i][j]+Math.min(left,Math.min(mid,right));

    return dp[i][j];

}

    public int minFallingPathSum(int[][] matrix) {

        int min=Integer.MAX_VALUE,n=matrix.length;
        dp= new int[n][n];

        for(int mat[] : dp){ 
            Arrays.fill(mat,-1000000);
        }

        for(int j=0;j<n;j++){ 
           min=Math.min(dfs(0,j,matrix),min);
        }

        return min;
        
        
        
    }
}