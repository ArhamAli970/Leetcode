class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int scBefore[]=new int[n];

        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i-1;j>=0;j--){
                if(rating[j]<rating[i]){c++;}
            }
            scBefore[i]=c;
        }

        int scAfter[]=new int[n];


         for(int i=0;i<n;i++){
            int c=0;
            for(int j=i+1;j<n;j++){
                if(rating[j]<rating[i]){c++;}
            }
            scAfter[i]=c;
        }

int cnt=0;
        for(int i=0;i<n;i++){
            int c1=scBefore[i];
            int c2=n-i-1-scAfter[i];
            cnt+=(c1*c2);

            int c3=scAfter[i];
            int c4=i-scBefore[i];
            cnt+=(c3*c4);


        }

return cnt;
        
    }
}