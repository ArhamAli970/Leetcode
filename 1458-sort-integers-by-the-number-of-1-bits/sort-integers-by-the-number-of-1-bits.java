class Solution {
    public int[] sortByBits(int[] arr) {

     TreeMap<Integer,PriorityQueue<Integer>> mp= new TreeMap<>();
     int n=arr.length;
    //  int ans[]= new int[m]

    for(int i=0;i<n;i++){ 
           int num=arr[i];
           int cnt=0;
           while(num>0){ 
               if((num&1)!=0) cnt++;
               num>>=1;
           }

           if(!mp.containsKey(cnt)){mp.put(cnt,new PriorityQueue<>());}
           mp.get(cnt).add(arr[i]);
           
    }
int idx=0;
    for(Map.Entry<Integer,PriorityQueue<Integer>> e: mp.entrySet()){ 
        PriorityQueue<Integer> pq= e.getValue();
        while(!pq.isEmpty()){ 
            arr[idx++]=pq.remove();
        }
    }

return arr;
    }
}