class Solution {
    static int dp[];
    public static int call(int i,String s){ 

        if(i>=s.length()){return 1;}

        if(dp[i]!=-1){return dp[i];}
         
        int st=0,end=0;
        if(s.charAt(i)=='0'){return 0;}

        if(s.charAt(i)=='1' || s.charAt(i)=='2'){ 
          st=call(i+1,s);
          if(( i+1<s.length() && s.charAt(i)=='1') ||(i+1<s.length() && s.charAt(i+1)-'0'<=6)){
          end=call(i+2,s);
          }
        }
        else{ 
            st=call(i+1,s);
        }

         dp[i]=st+end;
         return dp[i]; 

    }
    public int numDecodings(String s) {
        int n=s.length();
        // for(int i=1;i<n;i++){ 
        //     if((s.charAt(i)=='0' && s.charAt(i-1)=='0') || (s.charAt(i)=='0' && s.charAt(i-1)-'0'>2)){ 
        //            return 0;
        //     }
        // }

        if(s.charAt(0)=='0'){return 0;}

   
        dp= new int[n];
        Arrays.fill(dp,-1);
        
        
        return call(0,s);
    }
}