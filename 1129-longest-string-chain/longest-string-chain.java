class Solution {
    public static int dp[];

public static int wordChk(String w1,String w2){ 

int i=0,j=0,cnt=0,n=w1.length(),m=w2.length();


while(i<n && j<m){ 
    if(w1.charAt(i)!=w2.charAt(j)){ 
        j++;cnt++;
    }else{ 
        i++;j++;
    }
}

if(j==m-1){cnt++;}

return cnt==1?1:0;

}

    public int longestStrChain(String[] words) {

         Arrays.sort(words,(c,b)->{ 
            return c.length()-b.length();
        });
        int n=words.length;
        
        dp= new int[n];
        int maxAns=0;


        for(int i=0;i<n;i++){ 
            int max=0;
            for(int j=0;j<i;j++){ 

                if(words[j].length()+1 ==words[i].length() && wordChk(words[j],words[i])==1){ 
                    max=Math.max(dp[j],max);
                }

            }
              dp[i]=max+1;
            maxAns=Math.max(dp[i],maxAns);
          
        }

return maxAns;
    }
}