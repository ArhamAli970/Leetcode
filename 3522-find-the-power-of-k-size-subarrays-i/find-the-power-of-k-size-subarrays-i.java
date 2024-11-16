class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        int cnt=0;
       

        for(int i=0;i<n;i++){
             if(i>=k && nums[i-k]+1==nums[i-k+1]){
                cnt--;
            }
            if(i>=k-1){
                ans[i-k+1]=cnt==k-1?nums[i]:-1;
            }
            if(i+1<n && nums[i]+1==nums[i+1]){
                cnt++;
            }
           
        }
    return ans;       
    }
}