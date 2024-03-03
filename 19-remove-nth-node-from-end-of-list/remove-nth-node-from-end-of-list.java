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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        

ListNode h1=head,h2=null;
int cnt=0;

while(h1!=null){
    h1=h1.next;
    cnt++;
}

int res=cnt-n+1;
cnt=0;
h1=head;

while(h1!=null){

cnt++;
if(res==cnt){
    if(h2==null){return h1.next;}
    h2.next=h1.next;
    break;
}
h2=h1;
h1=h1.next;

}

return head;



    }
}