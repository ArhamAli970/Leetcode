class Solution {
    public int majorityElement(int[] nums) {
        int ele=nums[0],cnt=0,n=nums.length;

        for(int i=0;i<n;i++){
            if(ele==nums[i]){
                cnt++;
            }else{
                cnt--;
                if(cnt==0){
                    ele=nums[i];
                    cnt=1;
                }
            }
        }

        return ele;

        
    }
}