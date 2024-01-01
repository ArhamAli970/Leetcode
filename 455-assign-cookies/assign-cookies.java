class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int n=g.length,m=s.length;

        int i=0,j=0,cnt=0;

        while(i<n && j<m){ 
            if(s[j]>=g[i]){
                cnt++;i++;j++;
            }else{ 
                j++;
            }
        }
        return cnt;
    }
}