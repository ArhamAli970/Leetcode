class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int cnt=0;
       

        for(int i=0;i<n;i++){
            int cBefore=0,cAfter=0;
            for(int j=i-1;j>=0;j--){
                if(rating[j]<rating[i]){cBefore++;}
            }

            for(int j=i+1;j<n;j++){
                if(rating[j]<rating[i]){cAfter++;}
            }

            int mul1=cBefore*(n-i-1-cAfter);
            int mul2=cAfter*(i-cBefore);
            cnt+=(mul1+mul2);
         
        }



      

return cnt;
        
    }
}