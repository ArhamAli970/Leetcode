class Solution {
    public int countSubstrings(String s, String t) {

     int n=s.length(),m=t.length(),cnt=0;

     for(int i=0;i<n;i++){ 
         for(int j=0;j<m;j++){ 
             int x=i,y=j,diff=0;
             while(x<n && y<m){ 
                 if(s.charAt(x)!=t.charAt(y)) diff++;
                 if(diff==2) break;
                 if(diff==1) cnt++;
                 x++;y++;
             }
         }
     }

     return cnt;

    }
}