class Solution {

public static void swap(int i,int j,int nums[]){
    int ele=nums[i];
    nums[i]=nums[j];
    nums[j]=ele;


}

    public void sortColors(int[] nums) {
        
        int i=0,j=0,k=nums.length-1;

        while(j<=k){
            if(nums[i]==0){i++; if(j<i){j=i;}}
            else if(nums[j]==2){
                swap(j,k,nums);
                k--;
            }
            else if(nums[j]==0){
                swap(i,j,nums);
                i++;
                j++;
            }else{
                j++;
            }
        }


    }
}