class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){return nums[0];}
        int j=0,n=nums.length;
        int ans=nums[0];
        int prod=1;
        

        for(int i=0;i<=n;i++){
            if(i==n  || nums[i]==0){
                while(j<i && prod<0){
                    prod/=nums[j++];
                }
                if(i!=j){ans=Math.max(prod,ans);}
                if(i<n){ans=Math.max(ans,0);}
                j=i+1;
                prod=j<n?1:0;
            }
            else{
                prod*=nums[i];
                ans=Math.max(prod,ans);
                ans=Math.max(ans,nums[i]);
            }
        }

return ans;
        
    }
}