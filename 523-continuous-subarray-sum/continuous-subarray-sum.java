class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;

        

        HashMap<Integer,Integer> mp=new HashMap<>();
        int sum=0;
        mp.put(0,-1);


        for(int i=0;i<n;i++){
            sum+=(nums[i]%k);
            int val=sum%k;
            if(mp.containsKey(val)){
               if(i-mp.get(val)>1) return true;
            }else{
                mp.put(val,i);
            }  
        
        }

        return false;






        
    }
}