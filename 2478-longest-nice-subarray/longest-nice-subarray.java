class Solution {
    public static boolean chk(int cnt[]){
        for(int i=0;i<32;i++){
            if(cnt[i]>1){return true;}
        }

        return false;
    }
    public int longestNiceSubarray(int[] nums) {
       int cnt[]=new int[32];
       int i=0,max=0;

       for(int j=0;j<nums.length;j++){
            int ele=nums[j],idx=0;
            while(ele>0){
                if((ele&1)!=0){++cnt[idx];}
                ele>>=1;
                idx++;
            }

            while(chk(cnt)){
                ele=nums[i];
                idx=0;
                while(ele>0){
                    if((ele&1)!=0){--cnt[idx];}
                    ele>>=1;
                    idx++;
                }
                i++;
            }

            max=Math.max(j-i+1,max);

       }

       return max;

        
    }
}