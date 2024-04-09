class Solution {
    static class node{
        int ti;
        int idx;
        node(int ti,int idx){this.ti=ti;this.idx=idx;}
    }
    public int timeRequiredToBuy(int[] tickets, int k) {

        LinkedList<node> l= new LinkedList<>();

        for(int i=0;i<tickets.length;i++){
            l.add(new node(tickets[i],i));
        }

        int cnt=0;

        while(l.getFirst().ti!=1 || k!=l.getFirst().idx){
            node curr=l.removeFirst();
            // System.out.print(curr.ti+" "+curr.idx);
            cnt++;
            if(curr.ti>1){l.add(new node(curr.ti-1,curr.idx));}
        }

        return cnt+1;


        
    }
}