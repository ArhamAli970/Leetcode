class Solution {
    public String getSmallestString(int n, int k) {

        StringBuilder sb= new StringBuilder();
        k-=n;

        for(int i=0;i<n;i++){
            int diff=Math.min(k,25);
            sb.append((char)(diff+'a'));
            k-=diff;
        }

        return sb.reverse().toString();
        
    }
}