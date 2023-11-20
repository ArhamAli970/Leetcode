class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        PriorityQueue<Integer> pq2=new PriorityQueue<>(); 
        
        int i=0 ,j=costs.length-1;
        
        while(i<candidates){ 
        pq1.add(costs[i++]);
        }
        i--;
        
        while(j>i && j>=costs.length-candidates){ 
        pq2.add(costs[j--]);
        }
        j++;
        // System.out.print(i+" "+j);
        
        long cost=0;
        while(k-->0){ 
        if(!pq1.isEmpty() && ( pq2.isEmpty() || pq1.peek()<=pq2.peek())){ 
        cost+=pq1.remove();
            if(i+1<j){pq1.add(costs[++i]);}
        }
            else{ 
            cost+=pq2.remove();
                if(j-1>i){pq2.add(costs[--j]);}
            }
        
        }
        
        return cost;
        
        
    }
}