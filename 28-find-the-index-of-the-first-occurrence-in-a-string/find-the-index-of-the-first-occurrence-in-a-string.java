class Solution {

public static long call(int m,String s,int md){
    long pre=1 ,preComputed=0;
    for(int i=m-1;i>=0;i--){
            preComputed= (preComputed+ ((long)(s.charAt(i)-'a')*pre)%md)%md;
            pre=(pre*26)%md;
    }
return preComputed;
}

    public int strStr(String haystack, String needle) {
        int n=haystack.length(),m=needle.length();
        int i=0,md=1000000007;
        long ans=0,sub=1,preComputed=0;

        for(int k=0;k<m;k++){
            sub*=26;
            sub%=md;
        }

        preComputed=call(m,needle,md);

        i=0;
        if(m>n){return -1;}


        for(int j=0;j<n;j++){
            if(j==0){
                ans=call(m,haystack,md);
            }
            else if(j>=m){
                ans=(ans*26)%md;
                long lft=(sub*((long)haystack.charAt(i)-'a'))%md;
                long newChar=haystack.charAt(j)-'a';
                ans=ans-lft+newChar+md;
                ans%=md;
                i++;
            }

            // System.out.println(ans+" "+preComputed);

            if(ans==preComputed){return i;}
        }

        return -1;


        
    }
}