class Solution {
    public static int minWt;

    public static int checkPart(int[] weights,int lim,int days){
        int sum=0,cnt=0;
        for(int i : weights){
            if(i>lim){return Integer.MAX_VALUE;}
            else if(sum+i>lim){
                cnt++;
                sum=0;
            }
            sum+=i;
        }
        cnt++;
        // System.out.print(cnt+" "+lim);

        if(cnt<=days){minWt=Math.min(minWt,lim);}

        return cnt;
    }

    public int shipWithinDays(int[] weights, int days) {

        int sum=0;
        for(int i : weights){
            sum+=i;
        }
        minWt=Integer.MAX_VALUE;
        int st=0,end=sum;

        while(st<=end){
            int mid=(st+end)/2;

            int cnt=checkPart(weights,mid,days);
            if(cnt<=days){
                end=mid-1;
            }else if(cnt>days){
                st=mid+1;
            }
        }
        return minWt;
    }
}