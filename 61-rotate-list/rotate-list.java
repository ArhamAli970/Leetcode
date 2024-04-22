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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null){return head;}

int cnt=0;
ListNode p=head;
        while(p.next!=null){
            p=p.next;
            cnt++;
        }
        cnt++;



        int t=cnt-(k%cnt);
        if(k==0 || cnt==k  || t==cnt){return head;}

        ListNode prev=head,nxt=null;


        while(t>0){
            nxt=prev.next;
            t--;
            if(t==0){prev.next=null;break;}
            prev=prev.next;
        }

        p.next=head;

        return nxt;

        


        
    }
}