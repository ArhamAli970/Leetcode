class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
       int[] ans= new int[n+1];
       for(int i=0;i<n;i++){
           ++ans[nums[i]];
       }

int[] a= new int[2];
for(int i=0;i<=n;i++){
    if(ans[i]==0){a[1]=i;}
    if(ans[i]==2){a[0]=i;}
}

return a;

    }
}