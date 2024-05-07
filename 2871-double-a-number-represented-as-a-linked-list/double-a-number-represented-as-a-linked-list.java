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
    public static ListNode reverseList(ListNode head){
        ListNode prev=null,curr=head;
        while(true){
            ListNode nxt=curr.next;
            curr.next=prev;
            if(nxt==null){break;}
            prev=curr;
            curr=nxt;
        }
        return curr;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode now=reverseList(head);
        ListNode rev=now;
        int c=0;
        while(now!=null){
            int sum=now.val*2+c;
            now.val=sum%10;
            c=sum/10;
            now=now.next;
        }

        head=reverseList(rev);

        if(c>0){
            ListNode cr=new ListNode(c);
            cr.next=head;
            head=cr;
        }

        return head;

    }
}