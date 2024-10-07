class Solution {
    class node implements Comparable<node>{
        int cap,st;
        node(int cap,int st){
            this.cap=cap;
            this.st=st;
        }

        public int compareTo(node p){
            return this.st-p.st;
        }

    }
    public boolean carPooling(int[][] trips, int capacity) {
        
        Arrays.sort(trips,(a,b)->{
            if(a[1]==b[1]){return a[2]-b[2];}
            return a[1]-b[1];
        });

        PriorityQueue<node> pq=new PriorityQueue<>();

        for(int i=0;i<trips.length;i++){
            capacity-=trips[i][0];
            pq.add(new node(trips[i][0],trips[i][2]));
            while(!pq.isEmpty() && trips[i][1]>=pq.peek().st){
                node cld=pq.remove();
                capacity+=cld.cap;
            }
            if(capacity<0){return false;}
        }

        return true;
        

    }
}