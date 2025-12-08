class Solution {
    public int countTriples(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            int j=1,k=i;
            while(j<=k){
                long c1=j*j,c2=k*k,target=i*i;
                if(c1+c2==target){cnt+=2;k--;j++;}
                else if(c1+c2>target){k--;}
                else{j++;}
            }
        }
        
        return cnt;
        
        
    }
}