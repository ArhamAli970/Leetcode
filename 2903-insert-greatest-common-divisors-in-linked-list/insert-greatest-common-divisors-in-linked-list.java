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
    public static int gcd(int x,int y){
        for(int i=Math.min(x,y);i>0;i--){
            if(x%i==0 && y%i==0){return i;}
        }
        return -1;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode curr=head;

        while(curr.next!=null){
           int num=gcd(curr.val,curr.next.val);
           ListNode nxt=curr.next;
           curr.next=new ListNode(num);
           curr.next.next=nxt;
           curr=nxt;
        }


        return head;



    }
}