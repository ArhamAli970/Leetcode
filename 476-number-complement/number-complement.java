class Solution {
    public int findComplement(int num) {
        int ans=0,cnt=0;
        while(num>0){
            if((num&1)==0){
                ans+=(int)Math.pow(2,cnt);
            }
            cnt++;
            num>>=1;
        }

        return ans;
    }
}