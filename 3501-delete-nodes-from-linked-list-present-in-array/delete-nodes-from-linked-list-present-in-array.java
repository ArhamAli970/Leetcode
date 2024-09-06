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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums){h.add(i);}

        while(head!=null && h.contains(head.val)){head=head.next;}

        ListNode prev=null,curr=head;

        while(curr!=null){
            if(!h.contains(curr.val)){
                prev=curr;
            }else{
                while(curr!=null && h.contains(curr.val)){
                  curr=curr.next;
                }
                prev.next=curr;
                prev=prev.next;
                if(curr==null){break;}
            }

            curr=curr.next;
        }

        return head;


    }
}