class Solution {
    public int countSquares(int[][] matrix) {
        
        int n=matrix.length,m=matrix[0].length,sum=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){continue;}
                int dig=i-1>=0 && j-1>=0? matrix[i-1][j-1]:0;
                int up=i-1>=0?matrix[i-1][j]:0;
                int lft=j-1>=0?matrix[i][j-1]:0;
                int min=Math.min(dig,Math.min(up,lft));
                int sq=min+1;
                matrix[i][j]=sq;
                sum+=sq;
            }
        }

        return sum;
        
        
    }
}