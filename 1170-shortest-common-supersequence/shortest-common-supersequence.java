class Solution {
    static String dp[][];
    public static String call(int i,int j,String str1,String str2){ 
         
         if(i==str1.length() || j==str2.length()){ 
             return "";
         }
    
         if(!dp[i][j].equals("-1")){ 
             return dp[i][j];
         }

         if(str1.charAt(i)==str2.charAt(j)){ 
            dp[i][j]=str1.charAt(i)+call(i+1,j+1,str1,str2);
            return dp[i][j];
         }

     
            String ans1=call(i+1,j,str1,str2);
            String ans2=call(i,j+1,str1,str2);

            dp[i][j]= ans1.length()<ans2.length()?ans2:ans1;

         return dp[i][j];


    }
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length(),m=str2.length();
        dp= new String[n+1][m+1];

        for(String i[]: dp){ 
            Arrays.fill(i,"-1");
        }

        String ans= call(0,0,str1,str2);
        // System.out.print(ans);

        StringBuilder sb= new StringBuilder();

        int i=0,j=0,idx=0;
        while(idx<ans.length()){ 
            while(str1.charAt(i)!=ans.charAt(idx)){ 
                sb.append(str1.charAt(i++));
            }
            while(str2.charAt(j)!=ans.charAt(idx)){ 
                sb.append(str2.charAt(j++));
            }
            sb.append(ans.charAt(idx));
            i++;j++;idx++;
           
        }

    sb.append(str1.substring(i));
    sb.append(str2.substring(j));
   

       return sb.toString();
    }
}