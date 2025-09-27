class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,cnt=0;
        for(int i=0;i<n-1;i++){
            int sum=nums[i];
            int k=i+1;
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
                while(k<n && nums[k]<sum){
                    k++;
                }
                sum-=nums[j];
                if(k>j)cnt+=(k-j-1);
            
            }
        }

        return cnt;
        
    }
}