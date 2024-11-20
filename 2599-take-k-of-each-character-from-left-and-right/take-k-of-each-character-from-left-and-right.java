class Solution {
    public int takeCharacters(String s, int k) {

        int cnt1[]=new int[3];
        int cnt2[]=new int[3];
        int n=s.length();

        // int i=0,j=n-1;
        if(k==0){return 0;}

        for(int m=0;m<n;m++){
            ++cnt1[s.charAt(m)-'a'];
            ++cnt2[s.charAt(m)-'a'];
        }

    

        if(cnt1[0]<k || cnt1[1]<k || cnt1[2]<k){return -1;}
        int min=Integer.MAX_VALUE;

        int i=-1;

        for(int j=0;j<n;j++){
            
            while(cnt1[0]<k || cnt1[1]<k || cnt1[2]<k){
                ++i;
                ++cnt1[s.charAt(i)-'a'];
            }
            min=Math.min(i+1+n-j,min);
            --cnt1[s.charAt(j)-'a'];
        }
        i=n;
         for(int j=n-1;j>=0;j--){
            
            while(cnt2[0]<k || cnt2[1]<k || cnt2[2]<k){
                --i;
                ++cnt2[s.charAt(i)-'a'];
            }
            min=Math.min(j+1+n-i,min);
            --cnt2[s.charAt(j)-'a'];
        }

        return min;

        
        
        
    }
}