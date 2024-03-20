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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode h1= list1;
        --a;

        while(a>0){
            h1=h1.next;
            --a;--b;
        }

        ListNode h2=h1.next;
        --b;

        h1.next=list2;

        while(h1.next!=null){
            h1=h1.next;
        }


        while(b>0){
            --b;
            h2=h2.next;
        }

        h1.next=h2.next;


return list1;




    }
}