class Solution {
    public int numberOfWays(String corridor) {
        long ans=1;
        int mod=1000000007;
        int cntSeats=0;
        int corLen=corridor.length();
        for(int i=0;i<corLen;i++){ 
            if(corridor.charAt(i)=='S') cntSeats++;
        }

        if(cntSeats==0 || cntSeats%2!=0){return 0;}
        
        int cnteven=0;

        for(int i=0;i<corLen;i++){ 
           while(i<corLen && corridor.charAt(i)!='S'){i++;}
           ++cnteven;
           if(cnteven%2==0 && cnteven!=cntSeats){
               i++;
               int ways=1;
               while(i<corLen && corridor.charAt(i)!='S'){ways++;i++;}
               i--;
               ans=(ans*ways)%mod;
           }
           else if(cnteven==cntSeats){break;}

        }
return (int)ans%mod;

    }
}