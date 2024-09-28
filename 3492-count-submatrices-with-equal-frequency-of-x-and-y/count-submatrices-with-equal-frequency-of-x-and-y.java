class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        
        int cnt=0;
        int n=grid.length,m=grid[0].length;
        int mat[][][]=new int[n][m][2];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int x1=i-1>=0 && j-1>=0?mat[i-1][j-1][0]:0;
                int y1=i-1>=0 && j-1>=0?mat[i-1][j-1][1]:0;

                int xleft=j-1>=0?mat[i][j-1][0]:0;
                int yleft=j-1>=0?mat[i][j-1][1]:0;

                int xup=i-1>=0?mat[i-1][j][0]:0;
                int yup=i-1>=0?mat[i-1][j][1]:0;

                int reqSumx=xleft+xup-x1;
                int reqSumy=yleft+yup-y1;

                
                    mat[i][j][0] = reqSumx;
                    mat[i][j][1]=reqSumy;

                if(grid[i][j]=='X'){
                    ++mat[i][j][0];
                }

                if(grid[i][j]=='Y'){
                    ++mat[i][j][1];
                }

                if(mat[i][j][0]==mat[i][j][1] && mat[i][j][0]!=0){cnt++;}

            }
        }

        return cnt;



    }
}