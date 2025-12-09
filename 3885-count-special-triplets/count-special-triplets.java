class Solution {
    public int specialTriplets(int[] nums) {
        HashMap<Integer,Long> suff_mp=new HashMap<>();
        HashMap<Integer,Long> pref_mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            suff_mp.put(nums[i],suff_mp.getOrDefault(nums[i],0l)+1);
        }

        long ans=0;
        for(int i=0;i<nums.length;i++){
            suff_mp.put(nums[i],suff_mp.get(nums[i])-1l);
            long c1=suff_mp.getOrDefault(nums[i]*2,0l);
            long c2=pref_mp.getOrDefault(nums[i]*2,0l);
            pref_mp.put(nums[i],pref_mp.getOrDefault(nums[i],0l)+1l);
            ans+=c1*c2;
            ans%=1000000007;
        }

        return (int)ans;

    }
}