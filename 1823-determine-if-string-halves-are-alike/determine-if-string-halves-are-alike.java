class Solution {
    public boolean halvesAreAlike(String s) {
        char c[]={'a','e','i','o','u','A','E','I','O','U'} ;
        int k=0,t=0;
        for (int i=0;i<s.length();i++){  
            if (i==s.length()/2){ 
            t=k;
                k=0;
            }
              for (int j=0;j<c.length;j++){ 
                 if ((char) s.charAt(i)==c[j]){ 
                     k+=1;
                 }

              }
        }
if (t==k){ 
    return true;
}
return false;

    }
}