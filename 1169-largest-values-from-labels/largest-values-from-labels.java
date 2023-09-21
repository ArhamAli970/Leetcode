class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        
        HashMap<Integer,PriorityQueue<Integer>> mp= new HashMap<>();
        
        for(int i=0;i<labels.length;i++){ 
        
            if(!mp.containsKey(labels[i])){ 
                mp.put(labels[i],new PriorityQueue<>());
            }
            
            
            mp.get(labels[i]).add(values[i]);
            if(mp.get(labels[i]).size()>useLimit){mp.get(labels[i]).remove();}
        
            
        }
        
        
        PriorityQueue<Integer> p= new PriorityQueue<>();
        
        for(Map.Entry<Integer,PriorityQueue<Integer>> e: mp.entrySet()){ 
              PriorityQueue<Integer> pq= e.getValue();
              while(!pq.isEmpty()){ 
                  p.add(pq.remove());
                  if(p.size()>numWanted){p.remove();}
              }
        }
        
        int sum=0;
        while(!p.isEmpty()){ 
        sum+=p.remove();
        }
        
        return sum;
        
    }
}