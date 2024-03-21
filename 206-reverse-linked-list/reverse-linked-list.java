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
    public ListNode reverseList(ListNode head) {
        
        if(head==null){return null;}

        ListNode prev= null;
        ListNode curr=head;

        while(true){
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            if(nxt==null){break;}
            curr=nxt;

        }

        return  curr;

    }
}