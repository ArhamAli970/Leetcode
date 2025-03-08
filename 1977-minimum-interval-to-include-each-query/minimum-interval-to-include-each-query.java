class Solution {
    static class node implements Comparable <node>{
        int lst,diff;
        node(int lst,int diff){
            this.lst=lst;
            this.diff=diff;
        }

        public int compareTo(node p){
            return this.diff-p.diff;
        }
    }
    public int[] minInterval(int[][] intervals, int[] queries) {

        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        int ans[]=new int[queries.length];

        PriorityQueue<node> pq=new PriorityQueue<>();
        PriorityQueue<Integer> num=new PriorityQueue<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:queries){num.add(i);}

        int j=0,i=0,n=intervals.length;

        while(!num.isEmpty()){
            while(i<n && num.peek()>=intervals[i][0]){pq.add(new node(intervals[i][1],intervals[i][1]-intervals[i][0]));i++;}
            while(!pq.isEmpty() && pq.peek().lst<num.peek()){
                pq.remove();
            }
            int ele=pq.isEmpty()?-1:pq.peek().diff+1;
            mp.put(num.peek(),ele);
            num.remove();
        }

        for(i=0;i<queries.length;i++){
            ans[i]=mp.get(queries[i]);
        }

        return ans;

        
    }
}