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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode arr[]=new ListNode[k];

        int cnt=0;
        ListNode curr=head;

        while(curr!=null){cnt++;curr=curr.next;}

        
        int extra=cnt%k;
        int idx=0;

        curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode pre=curr;
            int div=cnt/k;
            while(div>0){
                prev=curr;
                curr=curr.next;
                div--;
            }
            if(extra>0){
                prev=curr;
                extra--;
                curr=curr.next;
            }

            prev.next=null;
            arr[idx++]=pre;
        
        }

return arr;

    }
}