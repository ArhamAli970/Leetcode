class Solution {
  

    static class meet implements Comparable <meet>{
        int room;int end;
        meet(int room,int end){
          this.room=room;
          this.end=end;
        }

        public int compareTo(meet p){
            if(this.end==p.end){
            return this.room-p.room;
            }
            return this.end-p.end;
        }

    }
    public int mostBooked(int n, int[][] meetings) {
       
       Arrays.sort(meetings,(a,b)->{
            return a[0]-b[0];
       });

    //    maxR=-1;maxUsed=-1;
       
       PriorityQueue<meet> pq= new PriorityQueue<>();
        // mp= new HashMap<>();
    
      
       int room[]=new int[n];
       long count[]= new long[n];

       for(int i=0;i<meetings.length;i++){
             while(!pq.isEmpty() && pq.peek().end<=meetings[i][0]){
                 room[pq.remove().room]=0;
             }

             int minRoom=-1;
             for(int j=0;j<n;j++){
                 if(room[j]==0){minRoom=j;break;}
             }

             if(minRoom!=-1){
                 room[minRoom]=1;
                 pq.add(new meet(minRoom,meetings[i][1]));
                 ++count[minRoom];
             }else{
                 meet curr=pq.remove();
                 pq.add(new meet(curr.room,curr.end+(meetings[i][1]-meetings[i][0])));
                 ++count[curr.room];
             }

       }

int maxIdx=0;
long max=0;
       
for(int i=0;i<n;i++){
    if(count[i]>max){
        maxIdx=i;
        max=count[i];
    }
}

return maxIdx;

    }
}