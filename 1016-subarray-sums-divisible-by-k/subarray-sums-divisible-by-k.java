class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ct=0,n=nums.length,sum=0;

        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);


        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
        
            if(mp.containsKey(rem)){
                ct+=mp.get(rem);
            }

        

            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }

        return ct;



    }
}