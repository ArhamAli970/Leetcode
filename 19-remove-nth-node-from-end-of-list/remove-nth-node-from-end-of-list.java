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
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }

        return prev;

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode p=reverse(head);

ListNode prev=null,h1=p;
int cnt=0;
if(n==1){p=p.next;cnt++;}
        while(cnt!=n){
            cnt++;
            if(cnt==n){
                    prev.next=h1.next;
                break;
            }
            prev=h1;
            h1=h1.next;
        }

      ListNode ans=reverse(p);
        

        return ans;

    }
}