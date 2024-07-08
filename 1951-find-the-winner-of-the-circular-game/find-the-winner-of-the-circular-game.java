class Solution {
    public int findTheWinner(int n, int k) {
        
        Deque<Integer> dq= new LinkedList<>();
        
        for(int i=1;i<=n;i++){dq.add(i);}
        
        
        while(dq.size()>1){
        
            for(int i=0;i<k-1;i++){
                dq.addLast(dq.remove());
            }
            
            dq.remove();
            
        }
        
        
        return dq.remove();
        
    }
}