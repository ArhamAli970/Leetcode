class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length(),cnty=0,cntn=0;
        for(int i=0;i<n;i++){
            cnty+=customers.charAt(i)=='Y'?1:0;
        }

        // if(n==cnty){return n;}


        int min=customers.length(),idx=0;
        for(int i=0;i<=n;i++){
            if(cnty+cntn<min){
                idx=i;
                min=cnty+cntn;  
            }
            if(i>=n){break;}
            char c=customers.charAt(i);
            cnty-=c=='Y'?1:0;
            cntn+=c=='N'?1:0;
        }

        return idx;
    }
}