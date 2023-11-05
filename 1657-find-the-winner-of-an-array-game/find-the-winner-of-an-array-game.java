class Solution {
    public int getWinner(int[] arr, int k) {
     
     if(k==1){return Math.max(arr[0],arr[1]);}
     int n=arr.length;

      // above are the end cases  
        int lst=arr[0],c=0;
        int max=arr[0];
     for(int i=0;i<n;){ 
         // we will loop inner loop and check the cnt till the lst number is Largest 
         while(i+1<n && arr[++i]<lst){ 
             max=Math.max(arr[i],max);
             c++; if(c==k){return lst;}
         }
         // we take c=1 here because the number we got now is become largest from the lst one  so it will be mark as count 1 and then we check again
     lst=arr[i];c=1;
     max=Math.max(lst,max);
     if(i+1==n){break;}
     }

// if nothing was determin with the loop we will return max
return max;

    }
}