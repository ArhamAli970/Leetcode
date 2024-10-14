class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int ileft=0,iright=0,i=0,n=arr.length;

        for(i=0;i<n;i++){
            if(arr[i]>=x){break;}
        }
        ileft=i-1;iright=i;
        int cntleft=0,cntright=0;


        while(cntleft+cntright<k){
            if(iright>=n){cntleft++;ileft--;}
            else if(ileft<0){cntright++;iright++;}
            else{
                int diff1=Math.abs(x-arr[ileft]);
                int diff2=Math.abs(x-arr[iright]);
                if(diff1<=diff2){
                    ileft--;
                    cntleft++;
                }else{
                    iright++;
                    cntright++;
                }
            }
 
        }

List<Integer> ans=new ArrayList<>();
        for(i=ileft+1;i<iright;i++){
            ans.add(arr[i]);
        }

        return ans;

    }
}