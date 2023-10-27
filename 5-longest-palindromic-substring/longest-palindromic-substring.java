class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String fin="";
        for(int i=0;i<n;i++){ 
             int j=i-1,k=i+1;
             while(j>=0 && k<n && s.charAt(j)==s.charAt(k)){ 
                 j--;
                 k++;
             }

             if(s.substring(j+1,k).length()>fin.length()){ 
                 fin=s.substring(j+1,k);
             }

        }

         for(int i=0;i<n;i++){ 
             int j=i,k=i+1;
             while(j>=0 && k<n && s.charAt(j)==s.charAt(k)){ 
                 j--;
                 k++;
             }

             if(s.substring(j+1,k).length()>fin.length()){ 
                 fin=s.substring(j+1,k);
             }

        }

return fin;
    }
}