class Solution {
    static int n;

    public static boolean isOk(int len,String s){
        int cnt[]=new int[26];

        for(int i=0;i<len;i++){
            ++cnt[s.charAt(i)-'a'];
        }
        
        for(int i=len;i<n;i+=len){
            int curr[]=new int[26];
            for(int j=i;j<i+len;j++){
                ++curr[s.charAt(j)-'a'];
            }

              

            for(int j=0;j<26;j++){
                // System.out.println(curr[j]+" "+cnt[j]);
                if(curr[j]!=cnt[j]){return false;}
            }

        }

        return true;
        


    }

    public int minAnagramLength(String s) {
        n=s.length();

        for(int i=0;i<n;i++){
            if(n%(i+1)==0 && isOk(i+1,s)){
                return i+1;
            }
        }

        return n;
        
    }
}