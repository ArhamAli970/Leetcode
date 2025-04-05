class Solution {
    static int cnt;
    public static void call(int st,int end,int nums[]){
        if(st==end){return;}
        int mid=(st+end)/2;

        call(st,mid,nums);
        call(mid+1,end,nums);
        sort(st,mid,end,nums);
        
    }
    public static void sort(int st,int mid,int end,int nums[]){
        int arr[]=new int[end-st+1];

        int i=st,j=mid+1;

        while(i<=mid && j<=end){
            long a1=(long)nums[j]*2;
            long a2=(long)nums[i];
            if(a2>a1){cnt+=mid-i+1;j++;}
            else{i++;}
        }

      
        int idx=0;i=st;j=mid+1;
        while(i<=mid && j<=end){
            if(nums[i]<=nums[j]){
                arr[idx++]=nums[i++];
            }else{
                arr[idx++]=nums[j++];                
            }
        }

        while(i<=mid){
            arr[idx++]=nums[i++];
        }

        while(j<=end){
            arr[idx++]=nums[j++];
        }
        idx=0;
        for(int k=st;k<=end;k++){
            nums[k]=arr[idx++];
        }

    }
    public int reversePairs(int[] nums) {
        cnt=0;
        call(0,nums.length-1,nums);
        return cnt;
    }
}