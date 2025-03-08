class Solution {
    public int[] closestPrimes(int left, int right) {

        boolean[] nums=new boolean[right+1];
        Arrays.fill(nums,true);
        int ans[]=new int[2];
        Arrays.fill(ans,-1);

        nums[0]=false;nums[1]=false;

        for(int i=2;i<=Math.sqrt(right);i++){
            for(int j=i*i;j<=right;j+=i){
                nums[j]=false;
            }
        }

        // for(int i=0;i<=right;i++){
        //     System.out.print(nums[i]+" ");
        // }

        int lst=-1,diff=Integer.MAX_VALUE;

        for(int i=left;i<=right;i++){
            if(nums[i]){
                if(lst!=-1 && diff>i-lst){
                    diff=i-lst;
                    ans[0]=lst;ans[1]=i;
                }
                lst=i;
            }
        }

        return ans;


        

        
    }
}