class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        int i1=-1,min=Integer.MAX_VALUE,n=arr.length;
        for(int i=0;i<n;i++){
            if(Math.abs(arr[i]-x)<min){
                min=Math.abs(arr[i]-x);
                i1=i;
            }
        }

        // System.out.print(i1);

        int i2=i1+1;

        while(k>0){
            if(i2>=n){i1--;}
            else if(i1<0){i2++;}
            else if(Math.abs(arr[i1]-x)<=Math.abs(arr[i2]-x)){i1--;}
            else{i2++;}
            k--;
        }

        for(int i=i1+1;i<i2;i++){
            ans.add(arr[i]);
        }

        return ans;

        

    

    }
}