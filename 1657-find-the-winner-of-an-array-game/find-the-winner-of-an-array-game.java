class Solution {
    public int getWinner(int[] arr, int k) {
     
     if(k==1){return Math.max(arr[0],arr[1]);}
     int max=0,n=arr.length;
     for(int i=0;i<n;i++){ 
           max=Math.max(arr[i],max);
     }

     if(k>=arr.length-1){ 
         return max;
     }
        
        int lst=arr[0],c=0;
     for(int i=0;i<n;){ 
         
         while(i+1<n && arr[++i]<lst){ 
             c++; if(c==k){return lst;}
         }
     lst=arr[i];c=1;
     if(i+1==n){break;}
     }

return max;

    }
}