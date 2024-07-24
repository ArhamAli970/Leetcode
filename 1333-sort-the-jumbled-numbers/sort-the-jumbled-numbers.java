class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n=nums.length;
        int arr[][]=new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            int num=nums[i],sum=0,mul=1;
            if(num==0){arr[i][1]=mapping[0];continue;}
            while(num>0){
                sum=sum+(mapping[num%10]*mul);
                mul*=10;
                num/=10;
            }
            arr[i][1]=sum;
        
        }

        Arrays.sort(arr,(a,b)->{
            return a[1]-b[1];
        });

    

        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            // System.out.println(arr[i][0]+" "+arr[i][1]);
            ans[i]=arr[i][0];
        }

        return ans;

    }
}