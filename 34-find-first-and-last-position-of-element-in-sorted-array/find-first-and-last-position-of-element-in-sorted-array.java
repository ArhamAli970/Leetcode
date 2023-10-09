class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]= new int[2];
        if (nums.length==1 && target==nums[0]){ 
            return arr;
        }


arr[0]=100000000;
arr[1]=-1;
int i=0;
int j=nums.length-1;
while (i<=j){ 
    if (nums[j]==target && j>arr[1]){ 
        arr[1]=j;
    }
     else if(nums[j]==target && j<arr[0]){ 
        arr[0]=j;
    }
    if (nums[i]==target && i<arr[0] ){ 
        arr[0]=i;
    }
    else if(nums[i]==target && i>arr[1]){ 
        arr[1]=i;
    }

    i++;
    j--;
}

if (arr[0]==100000000 && arr[1]==-1){ 
    arr[0]=-1;
}
else if (arr[0]!=100000000 && arr[1]==-1){ 
    arr[1]=arr[0];
}
else if(arr[0]==100000000 && arr[1]!=-1){ 
    arr[0]=arr[1];
}


return arr;
        
    }
}