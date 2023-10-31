class Solution {
    public int[] findArray(int[] pref) {
         
        int last=pref[0],n=pref.length; 

        for(int i=1;i<n;i++){ 
            int now=pref[i];
            pref[i]=last^now;
            last=now;
        }

        return pref;
        
    }
}