class Solution {
    static int mod;
    static long dp[][];
    public static long call(int i,int cnt,int n){ 
        if(cnt>=n){ return 1;}

        if(dp[cnt][i]!=-1){return dp[cnt][i];}
         long tot=0;
        if(i==0){ 
          tot= (call(4,cnt+1,n)+call(6,cnt+1,n))%mod; 
        }
        else if(i==1){ 
          tot= (call(8,cnt+1,n)+call(6,cnt+1,n))%mod; 
        }
        else if(i==2){ 
            tot= (call(7,cnt+1,n)+call(9,cnt+1,n))%mod;
        }
        else if(i==3){ 
           tot= (call(8,cnt+1,n)+call(4,cnt+1,n))%mod;
        }
        else if(i==4){ 
             tot= ((call(0,cnt+1,n)+call(3,cnt+1,n)+call(9,cnt+1,n))%mod) ;
        }
        else if(i==6){ 
            tot= ((call(0,cnt+1,n)+call(1,cnt+1,n)+call(7,cnt+1,n))%mod) ;
        }
        else if(i==7){ 
            tot= (call(2,cnt+1,n)+call(6,cnt+1,n))%mod;
        }
        else if(i==8){ 
           tot= (call(1,cnt+1,n)+call(3,cnt+1,n))%mod;
        }
        else if(i==9){ 
            tot= (call(2,cnt+1,n)+call(4,cnt+1,n))%mod;
        
        }

        dp[cnt][i]=tot;
        return dp[cnt][i];


        

    }

    public int knightDialer(int n) {
        
      mod=1000000007;
      dp= new long[n+1][10];
      long tot=0;

      for(long i[]:dp){ 
          Arrays.fill(i,-1);
      }


      for(int i=0;i<10;i++){ 
         tot=((tot+ (call(i,1,n)%mod))%mod);
      }

      return (int)tot%mod;


    }
}