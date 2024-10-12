class Solution {
    public int minGroups(int[][] intervals) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        int cnt=0;

        for(int i[]:intervals){
            if(!pq.isEmpty() && pq.peek()<i[0]){
                pq.remove();
                pq.add(i[1]);
            }else{
                cnt++;
                pq.add(i[1]);
            }
        }

return cnt;
    }
}