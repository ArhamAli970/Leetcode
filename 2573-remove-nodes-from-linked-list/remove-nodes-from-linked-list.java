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

    public static ListNode rev(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }

        return prev;

    }


    public ListNode removeNodes(ListNode head) {

    ListNode p=rev(head);
    // System.out.print(p.val);
    int max=p.val;
    ListNode h=null;

    while(p!=null){
        ListNode h1=p.next;
        if(p.val>=max){
            p.next=h;
            h=p;
            max=p.val;
        }
        p=h1;
    }

    return h;


    }
}