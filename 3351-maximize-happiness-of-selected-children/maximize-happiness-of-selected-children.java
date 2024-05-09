class Solution {
    public long maximumHappinessSum(int[] happy, int k) {

        long ans=0,cnt=0;
        Arrays.sort(happy);

        for(int i=happy.length-1;i>=happy.length-k;i--){
            ans+=(Math.max(happy[i]-cnt,0));
            cnt++;
        }


        return ans;
        
    }
}