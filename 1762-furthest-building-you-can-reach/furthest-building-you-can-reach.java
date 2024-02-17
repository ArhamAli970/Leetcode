class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {

        if(heights.length==1 ){return 0;}
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        int idx=1;

        while(idx<heights.length){

            if(heights[idx]>heights[idx-1]){
                pq.add(heights[idx]-heights[idx-1]);
            }

            if(pq.size()>ladders){
                bricks-=pq.remove();
            }

            if(bricks<0){return idx-1;}
            idx++;

        }

        return heights.length-1;
    }
}