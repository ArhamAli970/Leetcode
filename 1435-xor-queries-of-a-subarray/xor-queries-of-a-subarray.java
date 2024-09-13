class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=queries.length,m=arr.length;
        int ans[]=new int[n];
        int xorArr[]=new int[m];
        int xor=0;

        for(int i=0;i<m;i++){
            xor^=arr[i];
            xorArr[i]=xor;
        }

        for(int i=0;i<n;i++){
            int st=queries[i][0]-1<0?0:xorArr[queries[i][0]-1];
            int end=xorArr[queries[i][1]];

            ans[i]=st^end;

        }

        return ans;




    }
}