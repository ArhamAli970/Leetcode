class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        
        int n=nums.length;
        int[] sm=new int[n];
        
        for(int i=0;i<queries.length;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            ++sm[a];
            if(b+1<n){--sm[b+1];}
            
            
        }
        
        int curr=0;
        for(int i=0;i<n;i++){
            curr+=sm[i];
            if(curr<nums[i]){return false;}
            
        }
        
        return true;
        
        
    }
}