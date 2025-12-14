class Solution {
    public int numberOfWays(String corridor) {
        long ans=1l;
        int md=1000000007;
        int chair=0,chk=-1,inner=0;
        int corLen=corridor.length();
        for(int i=0;i<corLen;i++){ 
            char c=corridor.charAt(i);
            if(c=='S'){
                chair++;
                if(chair>2){
                    chair=1;ans*=(long)(1+inner);inner=0;ans%=md;
                }
            
            }else{
                if(chair==2){inner++;}
            }
        }
        if(chair!=2){return 0;}
        // if(inner>0){ans*=(long)inner;}
        return (int)(ans%md);

    }
}