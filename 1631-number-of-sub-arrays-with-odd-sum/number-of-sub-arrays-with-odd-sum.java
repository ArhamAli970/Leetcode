class Solution {
    public int numOfSubarrays(int[] arr) {

        int zero=1,one=0,sum=0;
        long ans=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            sum%=2;
            if(sum==0){zero++;}
            else{one++;}
            ans+=sum==0?one:zero;
            ans%=1000000007;
        }
        return (int)ans;
        
    }
}