class Solution {
    static long dp[][];
    static int mod=1000000007;
    static HashMap<Character,Integer> mp;
    static char arr[]={'a','e','i','o','u'};

     public static long call(char par,int i,int n){ 
        if(i>=n){return 1;}

        if(dp[i][mp.get(par)]!=-1){return dp[i][mp.get(par)];}
         
        if(par=='a'){
            dp[i][mp.get(par)]=call('e',i+1,n)%mod;
        }

        else if(par=='e'){
            long takeA=call('a',i+1,n)%mod;
            long takeI=call('i',i+1,n)%mod;
            dp[i][mp.get(par)]= (takeA+takeI)%mod;
        }

        else if(par=='i'){
             long tot=0;
            for(int j=0;j<=4;j++){ 
             if(j!=2){tot=((tot+call(arr[j],i+1,n))%mod);}
            }
             dp[i][mp.get(par)]= (tot)%mod;
        }

        else if(par=='o'){
            long takeU=call('u',i+1,n)%mod;
            long takeI=call('i',i+1,n)%mod;
            dp[i][mp.get(par)]= (takeU+takeI)%mod;
        }


        else if(par=='u'){
            long takeA=call('a',i+1,n);
            dp[i][mp.get(par)]= takeA%mod;
        }

return dp[i][mp.get(par)];

     }

    public int countVowelPermutation(int n) {
        
        dp= new long[n][5];
        mp=new HashMap<>();
        mp.put('a',0);mp.put('e',1);mp.put('i',2);
        mp.put('o',3);mp.put('u',4);


        for(long i[]:dp){ 
            Arrays.fill(i,-1);
        }

long tot=0;
for(int j=0;j<=4;j++){
       tot=((tot+call(arr[j],1,n))%mod); 
}

return (int)(tot);




    }
}