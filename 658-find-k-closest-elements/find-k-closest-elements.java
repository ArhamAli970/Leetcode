class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int sum=Integer.MAX_VALUE,currsum=0,idx=-1,j=0;

        for(int i=0;i<arr.length;i++){
            currsum+=Math.abs(x-arr[i]);
            if(i>=k-1){
                if(currsum<sum){sum=currsum;idx=i;}
                currsum-=Math.abs(x-arr[j++]);
            }
        }

        List<Integer> ans=new ArrayList<>();
        for(int i=idx-k+1;i<=idx;i++){
            ans.add(arr[i]);
        }

        return ans;
    }
}