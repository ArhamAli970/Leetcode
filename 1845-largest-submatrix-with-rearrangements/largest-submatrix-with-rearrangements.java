class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                matrix[j][i]=matrix[j][i]==0?0:matrix[j-1][i]+matrix[j][i];
            }
        }

int maxSize=0;
        for(int i=0;i<n;i++){
            Arrays.sort(matrix[i]);
            int min=Integer.MAX_VALUE,cnt=0;
            for(int j=m-1;j>=0;j--){
                min=Math.min(matrix[i][j],min);
                cnt++;
                maxSize=Math.max(maxSize,cnt*min);
            }
        }
        
        return maxSize;
    }
}