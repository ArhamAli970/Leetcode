class Solution {

    public static boolean call(int mid,int[] bloomDay,int m,int k){

        int cnt=0;

        for(int i=0;i<bloomDay.length;i++){

            if(bloomDay[i]<=mid){
                cnt++;
            }else{
                m-=cnt/k;
                cnt=0;

            }

        }

        m-=(cnt/k);

        return m<=0;

    }

    public int minDays(int[] bloomDay, int m, int k) {



        int st=0,end=1000000000;
        int ans=Integer.MAX_VALUE;

        while(st<=end){

            int mid=(st+(end-st)/2);
            // System.out.print(mid+" ");

            if(call(mid,bloomDay,m,k)){
                end=mid-1;
                ans=Math.min(ans,mid);
            }else{
                st=mid+1;
            }

        }


return ans==Integer.MAX_VALUE?-1:ans;
        
        
    }
}