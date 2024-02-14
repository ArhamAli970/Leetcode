class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        Queue<Integer> q1= new LinkedList<>();
        Queue<Integer> q2= new LinkedList<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]>=0){q1.add(nums[i]);}
            else{q2.add(nums[i]);}
        }
         
        for(int i=0;i<n;i++){
            nums[i]=i%2==0?q1.remove():q2.remove();
        }

return nums;
    }
}