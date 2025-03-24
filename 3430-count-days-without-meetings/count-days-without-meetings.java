class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->{
            return a[0]-b[0];
        });

        int cnt=meetings[0][0]-1,st=meetings[0][1];
        for(int i=0;i<meetings.length;i++){
            if(st<meetings[i][0]){
                cnt+=(meetings[i][0]-st-1);
            }
            st=Math.max(st,meetings[i][1]);
        }

        return cnt+days-st;
    }
}