class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        
         if(sx==fx && fy==sy && t==1){return false;}
     
        int x= Math.abs(sx-fx);
        int y= Math.abs(fy-sy);
        // int maxDiff=x+y;
        
        int m=Math.min(x,y); // how many diagnol movement we can do
        
        // to get extra distance left after moving diagnol
        int diff=Math.max(x,y)-Math.min(x,y);
        return t>=m+diff;
        
    }
}