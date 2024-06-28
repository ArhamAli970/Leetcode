class Solution {
    public long maximumImportance(int n, int[][] roads) {

        long ans=0;

        long arr[]=new long[n];

        for(int i=0;i<roads.length;i++){
            ++arr[roads[i][0]];
            ++arr[roads[i][1]];
        }

        Arrays.sort(arr);
        
        while(n>0){
            ans+=((long)n*arr[n-1]);
            n--;
        }

        return ans;


        
        
    }
}