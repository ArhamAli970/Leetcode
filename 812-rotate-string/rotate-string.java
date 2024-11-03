class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length(),m=goal.length();
        if(n!=m){return false;}
        boolean fin=false;

        for(int i=0;i<n;i++){
            int k=i;boolean ans=true;
            for(int j=0;j<m;j++){
                if(s.charAt(k)!=goal.charAt(j)){ans=false;break;}
                k=(k+1)%n;
            }
            fin|=ans;
        }

        return fin;
        
    }
}