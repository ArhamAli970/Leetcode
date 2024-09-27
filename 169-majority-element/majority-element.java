class Solution {
    public int majorityElement(int[] nums) {
        
        int ele=-1,cnt=0;

        for(int i:nums){
            if(cnt==0){ele=i;cnt=1;}
            else if(i==ele){cnt++;}
            else{cnt--;}
        }

        return ele;

    }
}