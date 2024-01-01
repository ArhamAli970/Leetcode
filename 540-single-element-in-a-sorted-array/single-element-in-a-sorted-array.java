class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        int st=0,end=n-1;

        while(st<=end){ 
            int mid=(st+end)/2;
            // if((mid-1>=0 && arr[mid-1]!=arr[mid]) && )

            if(mid-1>=0 && arr[mid]==arr[mid-1]){ 
                 if(mid%2==0){end=mid-1;}
                 else{st=mid+1;}
            }else if(mid+1<n && arr[mid]==arr[mid+1]){ 
                if(mid%2==0){st=mid+1;}
                else{end=mid-1;}
            }else{ 
                return arr[mid];
            }
        }

        return arr[st];
        
    }
}