class Solution {

 public static void merge(int arr[], int l, int m, int r)
    {
        int a[]=new int[r-l+1];
        
        int i=l,j=m+1,idx=0;
        
        while(i<=m && j<=r){
            if(arr[i]<arr[j]){
                a[idx++]=arr[i++];
            }else{
                a[idx++]=arr[j++];
            }
        }
        
        while(i<=m){a[idx++]=arr[i++];}
         
         while(j<=r){a[idx++]=arr[j++];}
         
         int st=l;idx=0;
         
         while(idx<a.length){
             arr[st++]=a[idx++];
         }
         
    }

    public static void mergeSort(int arr[], int l, int r)
    {
        if(l>=r){return;}
       int md=(l+r)/2;
       mergeSort(arr,l,md);
       mergeSort(arr,md+1,r);
       
       merge(arr,l,md,r);
       
}

    public int[] sortArray(int[] nums) {

       mergeSort(nums,0,nums.length-1);
       return nums;
        
    }
}