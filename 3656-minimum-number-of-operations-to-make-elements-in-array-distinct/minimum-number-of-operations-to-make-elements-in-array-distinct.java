class Solution {
    public int minimumOperations(int[] nums) {

        boolean chk[]=new boolean[101];
        int n=nums.length,i=0;

        for(i=n-1;i>=0;i--){
            if(chk[nums[i]]){break;}
            chk[nums[i]]=true;
        }
        i++;
        return (i/3)+(i%3==0?0:1);
        
    }
}