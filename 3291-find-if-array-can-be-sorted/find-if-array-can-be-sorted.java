class Solution {
    public static boolean chkSet(int x,int y){
        int c=0;
        while(x>0){
            c++;
            x=x&(x-1);
        }

        while(y>0){
            c--;
            y=y&(y-1);
        }
        return c==0;
    }
    public boolean canSortArray(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            int j=i-1,k=i;
            while(j>=0 && nums[j]>nums[k] && chkSet(nums[j],nums[k])){
                int ele=nums[j];
                nums[j]=nums[k];
                nums[k]=ele;
                j--;
                k--;
            }

            if(j>=0 && nums[k]<nums[j]){return false;}

        }


return true;
    }
}