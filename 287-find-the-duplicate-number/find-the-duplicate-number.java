class Solution {
    public int findDuplicate(int[] nums) {
        
        // HashMap<Integer,Integer> mp= new HashMap<>()

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){ 
            if(nums[i]==nums[i+1]){ 
                return nums[i];
            }
        }


return 0;

    } 
}