/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {

if(head==null || head.next==null){return head;}

        ListNode h1=null,h2=null,p1=null,p2=null;

        while(head!=null){
            if(head.val<x){
                if(h1==null){h1=head;p1=h1;}
                else{p1.next=head;p1=p1.next;}
                head=head.next;
                p1.next=null;
            }else{
               if(h2==null){h2=head;p2=h2;}
                else{p2.next=head;p2=p2.next;} 
                head=head.next;
                p2.next=null;
            }
        }

        if(p1==null){return h2;}

        p1.next=h2;

        return h1;






        
    }
}