class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=0;
        for(int i:nums){ans^=i;}
        int cnt=0;
        while(k>0 || ans>0){
            if( ((k&1)!=0 && (ans&1)==0) || ((k&1)==0 && (ans&1)!=0)){
                cnt++;
            }
            k>>=1;
            ans>>=1;
        }

        return cnt;
    }
}