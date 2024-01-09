/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    static ArrayList<Integer> a;

    public static void call(Node curr){

           while(curr!=null){
                a.add(curr.val);
                if(curr.child!=null){
                call(curr.child);
                }
                curr=curr.next;
           }
    }

    public Node flatten(Node head) {

        Node curr=head;
        a=new ArrayList<>();
        call(curr);

        if(a.size()==0){return null;}

int i=1;
        
        
        curr=new Node(a.get(0));
        Node h=curr;
        Node prv=null;

        while(i<a.size()){
            curr.next=new Node(a.get(i));
            prv=curr;
            curr=curr.next;
            curr.prev=prv;
            i++;
        }


return h;
        
    }
}