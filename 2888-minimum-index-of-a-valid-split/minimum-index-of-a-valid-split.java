class Solution {
    public int minimumIndex(List<Integer> nums) {

        int cnt=1,val=nums.get(0),n=nums.size();
        for(int i=1;i<n;i++){
            if(val!=nums.get(i)){cnt--;if(cnt==0){val=nums.get(i);cnt=1;}}
            else{cnt++;}
        }

        cnt=0;

        for(int i:nums){if(i==val){cnt++;}}

        int rem=0;
        for(int i=0;i<n;i++){
            if(nums.get(i)==val){rem++;cnt--;}
            if(rem*2>(i+1) && cnt*2>n-i-1){
                return i;
            }
        }
        
        return -1;
    }
}