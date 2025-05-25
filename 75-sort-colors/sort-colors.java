class Solution {

    public static void swap(int i,int j,int nums[]){
        int ele=nums[i];
        nums[i]=nums[j];
        nums[j]=ele;
    } 

    public void sortColors(int[] nums) {
        int n=nums.length,j=0,i=0,k=n-1;
        for(j=0;j<n;j++){
            if(nums[j]==0){
                while(i<j && nums[i]==0){i++;}
                swap(i,j,nums);
            }
            else if(nums[j]==2){
                while(k>j && nums[k]==2){k--;}
                if(j>=k){break;}
                swap(k,j,nums);
                if(nums[j]==0){j--;}
            }
        }


        
    }
}