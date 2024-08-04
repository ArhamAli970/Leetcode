class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int md=1000000007;
        int sz=(n*(n+1))/2;
        long arr[]=new long[sz];

int idx=0;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                sum%=md;
                arr[idx++]=sum;
            }
        }

Arrays.sort(arr);
long sum=0;
        for(int i=left-1;i<right;i++){
            sum+=arr[i];
            sum%=md;
        }

        return (int)sum;
    }
}