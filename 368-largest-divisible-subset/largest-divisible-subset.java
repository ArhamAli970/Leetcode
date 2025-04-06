class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        int n=nums.length;
        int cnt[]=new int[n];
        int maxLen=0;
        Arrays.sort(nums);
        
        
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=i-1;j>=0;j--){
                if(nums[i]%nums[j]==0){
                    max=Math.max(cnt[j],max);
                }
            } 
            cnt[i]=max+1; 
            maxLen=Math.max(maxLen,cnt[i]);
        }
        
        List<Integer> ans=new ArrayList<>();
        
        int lst=-1;
        for(int j=nums.length-1;j>=0;j--){
           if(cnt[j]==maxLen && (lst==-1 || lst%nums[j]==0)){
               ans.add(nums[j]);
               maxLen--;
               lst=nums[j];
           }
        }
        
        int i=0,j=ans.size()-1;
        while(i<j){
            int ele=ans.get(i);
            ans.set(i,ans.get(j));
            ans.set(j,ele);
            i++;j--;
        }
        
        return ans;
        
        
    }
}