class Solution {
    public int destroyTargets(int[] nums, int space) {

     Arrays.sort(nums);
     HashMap<Integer,Integer> mp= new HashMap<>();
     int n=nums.length,max=0,minNum=-1;

     for(int i=n-1;i>=0;i--){   
     
        mp.put(nums[i]%space,mp.getOrDefault(nums[i]%space,0)+1);
   
        if(max<=mp.get(nums[i]%space)){ 
           minNum=nums[i];
           max=mp.get(nums[i]%space);
        }
     }

return minNum;
    }
}