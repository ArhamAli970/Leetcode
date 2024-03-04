class Solution {
    public int minimumOperationsToWriteY(int[][] grid) {
        
        
       int arr1[]=new int[3];
       int arr2[]=new int[3];
        int n=grid.length;
        
        int mid=n/2;
        int i=0,j=0,k=n-1;
        
        while(j!=k){
           ++arr1[grid[i][j]];
             ++arr1[grid[i][k]];
            grid[i][j]=-1;grid[i][k]=-1;
            i++;
            j++;
            k--;
        }
        
        j=n/2;
        for( i=n/2;i<n;i++){
           ++arr1[grid[i][j]];
            grid[i][j]=-1;
        }
        
        for( i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(grid[i][j]!=-1){
                                ++arr2[grid[i][j]];
                }
            }
        }

    //    System.out.println(mp1); 
    //           System.out.println(mp2); 

        
        int ans=n*n;
        int min=Integer.MAX_VALUE;

        for( i=0;i<3;i++){
            for( j=0;j<3;j++){
                if(i!=j){
                    min=Math.min(ans-arr1[i]-arr2[j],min);
                }
            }
        }
      
        
        
        return min;
        
        
        
        
        
        

        
    }
}