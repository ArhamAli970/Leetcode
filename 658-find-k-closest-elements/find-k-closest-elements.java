class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        for(int i=0;i<n;i++){ 
            arr[i]-=x;
        }

int st=0,end=n-1,min=Integer.MAX_VALUE,idx=-1;;

        while(st<=end){ 
            int mid=(st+end)/2;

            if(arr[mid]>0){
                end=mid-1;
                if(Math.abs(arr[mid])<min){idx=mid;min=Math.abs(arr[mid]);}
            }else{ 
                st=mid+1;
                if(Math.abs(arr[mid])<=min){idx=mid;min=Math.abs(arr[mid]);}

            }

        }



List<Integer> l= new ArrayList<>();
int i=idx,j=idx+1;

while(k>0 && i>=0 && j<n){ 
    if(Math.abs(arr[i])<=Math.abs(arr[j])){ 
        l.add(x+arr[i]);i--;
    }
    else{ 
        l.add(x+arr[j]);j++;
    }
   
    k--;
}

while(k>0 && j<n){ 
    l.add(x+arr[j]);j++;k--;
}

while(k>0 && i>=0){ 
    l.add(x+arr[i]);i--;k--;
}


Collections.sort(l);

return l;

        
    }
}