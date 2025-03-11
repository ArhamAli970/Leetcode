class Solution {
    public int numberOfSubstrings(String s) {
        
        int a=0,b=0,c=0;
        
        int i=0,j=0,n=s.length(),cnt=0;
        
        for(j=0;j<n;j++){
           char ch=s.charAt(j);
           if(ch=='a'){a++;}
           else if(ch=='b'){b++;}
           else{c++;}
           while(a>0 && b>0 && c>0){
            cnt+=n-j;
              if(s.charAt(i)=='a'){--a;}
              else if(s.charAt(i)=='b'){--b;}
              else{--c;}
              i++;
            } 

        }
        
        return cnt;
        
        
    }
}