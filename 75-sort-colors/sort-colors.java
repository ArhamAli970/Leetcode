class Solution {
    public static void swap(int i1,int i2,int[] nums){
        int num=nums[i1];
        nums[i1]=nums[i2];
        nums[i2]=num;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=0,j=0,k=n-1;

        while(j<=k){

            

            if(nums[i]==1 && nums[j]==0){
                swap(i,j,nums);
                ++j;++i;
            }
            else if(j!=k && nums[j]==2){
                while(k>=0 && nums[k]==2){k--;}
                if(j>=k){break;}
                swap(j,k,nums);
                k--;
            }else{
                j++;
            }

            while(i<n && nums[i]==0){
                i++;
            }

            if(i>j){j=i;}
            // System.out.println();
        }
        
    }
}