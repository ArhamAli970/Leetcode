class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
          int i=0,j=0,l=0,cnt=0,n=nums.length;

          HashMap<Integer,Integer> mp= new HashMap<>();

          while(j<n){

            while(j<n && mp.size()<k){
                mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
                j++;
            }
            j--;

            l=Math.max(j+1,l);
            while(l<n && mp.containsKey(nums[l])){
                l++;
            }

            while(mp.size()==k){
                cnt+=l-j;
                int val=mp.get(nums[i]);
                if(val==1){
                    mp.remove(nums[i]);
                }else{
                    mp.put(nums[i],val-1);
                }
                i++;
            }
            j++;
          }


        return cnt;

    }
}