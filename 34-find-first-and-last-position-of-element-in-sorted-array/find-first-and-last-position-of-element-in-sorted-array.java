class Solution {
    public int[] searchRange(int[] arr, int x) {
        int ans[]=new int[2];
        int n=arr.length;
        
        int foundLast=-1,foundFirst=-1;
        
        int st=0,end=n-1;
        while(st<=end){ 
         
         int mid=(st+end)/2;
         
         if(arr[mid]<x){ 
          st=mid+1;   
         }
         else if(arr[mid]>x){ 
          end=mid-1;   
         }
         else{ 
          foundLast=mid;
          st=mid+1;
         }
        } 
        
        
          st=0;end=n-1;
        while(st<=end){ 
         
         int mid=(st+end)/2;
         
         if(arr[mid]<x){ 
          st=mid+1;   
         }
         else if(arr[mid]>x){ 
          end=mid-1;   
         }
         else{ 
          foundFirst=mid;
          end=mid-1;
         }
        }
        
        
        ans[0]=foundFirst;
        ans[1]=foundLast;
        return ans;  
    }
}