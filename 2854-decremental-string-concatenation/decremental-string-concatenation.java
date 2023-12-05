class Solution {
    
    static int dp[][][];
    
    
    public static String newString(String str1,String str2){ 
        if(str1.charAt(str1.length()-1)==str2.charAt(0)){return str1+str2.substring(1);}
        return str1+str2;
    }
    
    
    
    public static int call(String[] words,int i,String ans){ 
    
        if(i>=words.length){return 0;}
        int n=ans.length();
        // System.out.print(i+" ");
        
        if(dp[i][ans.charAt(0)-'a'][ans.charAt(n-1)-'a']!=-1){return dp[i][ans.charAt(0)-'a'][ans.charAt(n-1)-'a'];}
        
        String ans1=newString(words[i],ans);
        int take1=call(words,i+1,ans1)+(ans1.length()-n);
        String ans2=newString(ans,words[i]);
        int take2=call(words,i+1,ans2)+(ans2.length()-n);
        
        
        dp[i][ans.charAt(0)-'a'][ans.charAt(n-1)-'a']=Math.min(take1,take2);
        
        return   dp[i][ans.charAt(0)-'a'][ans.charAt(n-1)-'a'];
        
    
        
    }
    
    
    public int minimizeConcatenatedLength(String[] words) {
        
        int n=words.length;
        dp=new int[n][26][26];

        for(int i=0;i<n;i++){ 
            for(int j=0;j<26;j++){ 
                for(int k=0;k<26;k++){ 
                    dp[i][j][k]=-1;
                }
            }
        }
        
        
        
        int totLen=0;
         // for(int i=0;i<n;i++){ 
         // totLen+=words[i].length();
         //     }
        
        return words[0].length()+call(words,1,words[0]);
        
        
        
        
    }
}