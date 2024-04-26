class Solution {
    public int minFallingPathSum(int[][] arr) {
        int n=arr.length,m=arr[0].length;
        for(int i=1;i<n;i++){
            int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                if(arr[i-1][j]<min1){
                    min2=min1;
                    min1=arr[i-1][j];
                }
                else if(arr[i-1][j]<min2){
                    min2=arr[i-1][j];
                }
            }

            for(int j=0;j<m;j++){ 
                    arr[i][j]+=min1==arr[i-1][j]?min2:min1;   
            }

        }

        int minSum=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            minSum=Math.min(minSum,arr[n-1][j]);
        }

        return minSum;
        
    }
}