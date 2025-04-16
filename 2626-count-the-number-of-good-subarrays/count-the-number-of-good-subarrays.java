class Solution {
    public long countGood(int[] nums, int k) {

        long cnt=0,ans=0;
        HashMap<Integer,Long> mp=new HashMap<>();
        int n=nums.length;
        int j=0;

        for(int i=0;i<nums.length;i++){
            cnt+=mp.getOrDefault(nums[i],0l);
            mp.put(nums[i],mp.getOrDefault(nums[i],0l)+1);
            if(cnt>=k){
                while(i>=j && cnt>=k){
                    ans+=n-i;
                    mp.put(nums[j],mp.get(nums[j])-1);
                    cnt-=mp.get(nums[j]);
                    if(mp.get(nums[j])==0){mp.remove(nums[j]);}
                    j++;
                }
            }
        }

        

        


        return ans;
        
    }
}