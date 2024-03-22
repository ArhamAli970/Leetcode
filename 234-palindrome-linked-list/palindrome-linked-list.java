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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;


          while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
          }

          ListNode prev=null;

          while(true){
            ListNode nxt=slow.next;
            slow.next=prev;
            if(nxt==null){break;}
            prev=slow;
            slow=nxt;
          }

          ListNode h1=head;

          while(h1!=null && slow!=null){
            if(h1.val!=slow.val){
                return false;
            }
            h1=h1.next;
            slow=slow.next;
          }

          return true;




    }
}