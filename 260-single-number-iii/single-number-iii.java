class Solution {
    public int[] singleNumber(int[] nums) {

       int arr[]= new int[2];

       int ans=0;
       for(int i=0;i<nums.length;i++){ 
           ans^=nums[i];
       } 

int cnt=0;
       while((ans&1)!=1){ 
           ans>>=1;
           cnt++;
       }

// System.out.print(cnt+" "+ans+" "+(3^5));
int ans1=0,ans2=0;

for(int i=0;i<nums.length;i++){ 
    if((nums[i]& (1<<cnt))!=0){ 
        ans1^=nums[i];
    }
    else{ 
        ans2^=nums[i];
    }
    
}


arr[0]=ans1;arr[1]=ans2;
return arr;



    }
}