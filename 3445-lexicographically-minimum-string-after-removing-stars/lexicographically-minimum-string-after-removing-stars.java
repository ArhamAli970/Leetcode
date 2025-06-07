class Solution {
    
    
    static class node implements Comparable <node> {
        int idx;
        int val;
        
        node(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        
        public int compareTo(node p){
            if(this.val==p.val){
                return p.idx-this.idx;
            }
            return this.val-p.val;
        }
        
    }
    
    public String clearStars(String s) {
        
        int n=s.length();
        
        StringBuilder sb= new StringBuilder();
        
        PriorityQueue<node> pq= new PriorityQueue<>();
        boolean ans[]=new boolean[n];
        
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                node curr=pq.remove();
                ans[curr.idx]=true;
            }else{
                pq.add(new node(s.charAt(i)-'a',i));
            }
        }
        
        
        for(int i=0;i<n;i++){
            if(!ans[i] && s.charAt(i)!='*'){
                sb.append(s.charAt(i));
            }
        }
        
        
        return sb.toString();
    
        
    }
}