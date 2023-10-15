class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int mod=12345;
        int n=grid.length,m=grid[0].length;
        int arr[]=new int[n*m];
        int idx=0;
        
        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){ 
                arr[idx++]=grid[i][j];
            }
        }

        long[] suffPrd=new long[n*m];
        long[] prefPrd=new long[n*m];

        prefPrd[0]=1;
        for(int i=1;i<n*m;i++){ 
          prefPrd[i]= (arr[i-1]*prefPrd[i-1])%mod;
        }

        suffPrd[(n*m)-1]=1;

        for(int i=(n*m)-2 ;i>=0 ;i--){ 
            suffPrd[i]=(arr[i+1]*suffPrd[i+1])%mod;
        }

idx=0; 
        for(int i=0;i<n;i++){ 
              
              for(int j=0;j<m;j++){ 
                  grid[i][j]=(int)((suffPrd[idx]*prefPrd[idx++])%mod);
              }

        }


        return grid;




    }
}