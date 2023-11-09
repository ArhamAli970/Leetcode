class Solution {
    public int countHomogenous(String s) {
       int mod=1000000007;
       int i=0,j=0,n=s.length();
       long tot=0;

       while(j<n){ 

            while(j<n && s.charAt(i)==s.charAt(j)){ 
                j++;
            }

            while(j-i>0){ 
             
            tot=(tot+(j-i))%mod;
            i++; 
            }           
           
       } 


        return (int)tot%mod;  

    }
}