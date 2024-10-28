class Solution {

    public static int call(int nums[],int end,int curr){
        int st=0,mid=0;
        while(st<=end){
            mid=(st+end)/2;
            int sq=nums[mid]*nums[mid];
            if(sq<curr){
                st=mid+1;
            }else if(sq>curr){
                end=mid-1;
            }else{
                break;
            }
        }

        return curr==nums[mid]*nums[mid]?mid:-1;

    }



    public int longestSquareStreak(int[] nums) {
  
        Arrays.sort(nums);
        int max=1,n=nums.length;

        int prev[]=new int[n];

        for(int i=0;i<n;i++){
            int getIdx=call(nums,i-1,nums[i]);
            int sum=getIdx<0?1:prev[getIdx]+1;
            prev[i]=sum;
            max=Math.max(max,prev[i]);
        }

        return max==1?-1:max;



        

    }
}