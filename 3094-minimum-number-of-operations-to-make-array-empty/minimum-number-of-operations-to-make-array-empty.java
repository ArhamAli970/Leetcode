class Solution {
    public int minOperations(int[] nums) {
        
        HashMap<Integer,Integer> mp= new HashMap<>();
        
        for(int i=0;i<nums.length;i++){ 
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        
        int cnt=0;
        
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){ 
        
            int val=e.getValue();
            if(val<2){return -1;}

            if(val%3==1){val+=2;}
            else if(val%3==2){val++;}
            cnt+=(val/3);            
            
        }
        
        return cnt;
        
    }
}