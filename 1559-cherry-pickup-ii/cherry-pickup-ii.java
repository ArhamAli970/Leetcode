class Solution {
    static int dp[][][];
    static int arr[][]= {{0,0},{0,-1},{0,1},{1,0},{1,-1},{1,1},{-1,0},{-1,1},{-1,-1}};

public static int call(int i,int j, int l,int grid[][]){
   if(i<0 || j<0 || l<0 || i==grid.length || j==grid[0].length|| l==grid[0].length){
       return 0;
   }

if(dp[i][j][l]!=-1){return dp[i][j][l];}

int max=0;


for(int m=0;m<arr.length;m++){
    max=Math.max(max,call(i+1,j+arr[m][0],l+arr[m][1],grid));
}
max+=grid[i][l];
if(j!=l){max+=grid[i][j];}

dp[i][j][l]=max;
return max;
}

    public int cherryPickup(int[][] grid) {
        dp= new int[71][71][71];

        for(int i=0;i<71;i++){
            for(int j=0;j<71;j++){
                    for(int l=0;l<71;l++){
                        dp[i][j][l]=-1;
                    }
            }
        }

        return call(0,0,grid[0].length-1,grid);
    }
}