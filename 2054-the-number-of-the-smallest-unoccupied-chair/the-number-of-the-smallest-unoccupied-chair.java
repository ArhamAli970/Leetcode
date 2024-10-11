class Solution {
    static class node implements Comparable <node>{
        int arr,dest,chr;
        node(int arr,int dest,int chr){
            this.arr=arr;
            this.dest=dest;
            this.chr=chr;
        }

      public int compareTo(node p){
        return this.dest-p.dest;
      }

    }
    public int smallestChair(int[][] times, int targetFriend) {
        
        int currChr=-1;
        int target=times[targetFriend][0];

        Arrays.sort(times,(a,b)->{
            return a[0]-b[0];
        });

        PriorityQueue<node> pq=new PriorityQueue<>();
        PriorityQueue<Integer> time=new PriorityQueue<>();
        for(int i=0;i<times.length;i++){
            int ch=0;
            while(!pq.isEmpty() && pq.peek().dest<=times[i][0]){
                node curr=pq.remove();
                time.add(curr.chr);
            }
            
            if(time.size()>0){
                ch=time.remove();
            }
            else{
                currChr++;
                ch=currChr;
            }
            if(times[i][0]==target){return ch;}
            pq.add(new node(times[i][0],times[i][1],ch));
        }

return -1;

    }
}