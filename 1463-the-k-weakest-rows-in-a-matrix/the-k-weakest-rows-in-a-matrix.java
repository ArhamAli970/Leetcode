class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {

         int ans[]= new int[k];
        int n=mat.length,m=mat[0].length;
        int arr[][]= new int[n][2];

        for(int i=0;i<n;i++){ 
            int j=0;
            while(j<m && mat[i][j]!=0){
                j++;

            }
            arr[i][0]=j;
            arr[i][1]=i;
        }

Arrays.sort(arr,(int a[],int b[])->{ 
    if(a[0]!=b[0]){ 
        return a[0]-b[0];
    }
    return a[1]-b[1];
});

for(int i=0;i<k;i++){ 
ans[i]=arr[i][1];
}

return ans;

        
    }
}