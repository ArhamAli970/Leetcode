class Solution {
    public int maximumSwap(int num) {
        int max=0,idx=9;
        int arr[]=new int[10];

        while(num>0){
            int curr=num%10;
            arr[idx--]=curr;
            num/=10;
            max=Math.max(curr,max);
        }

      for(int i=idx+1;i<arr.length;i++){
        int curr=i;
        for(int j=9;j>i;j--){
            if(arr[curr]<arr[j]){
                curr=j;
            }
        }
        if(curr!=i){
             int ele=arr[i];
                arr[i]=arr[curr];
                arr[curr]=ele;
                break;
        }
      }
int ans=0;
      for(int i=idx+1;i<10;i++){
        ans=ans*10+arr[i];
      }

      return ans;

// return ans;


        
        
    }
}