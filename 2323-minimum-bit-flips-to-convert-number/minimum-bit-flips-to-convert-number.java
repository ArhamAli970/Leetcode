class Solution {
    public int minBitFlips(int start, int goal) {
        
        int cnt=0;

        while(start>0 || goal>0){
            int v1=(start&1);
            int v2=(goal&1);
            start>>=1;
            goal>>=1;
            if((v1==0 && v2==0) || (v1!=0 && v2!=0)){continue;}
            cnt++;
        }

        return cnt;

    }
}