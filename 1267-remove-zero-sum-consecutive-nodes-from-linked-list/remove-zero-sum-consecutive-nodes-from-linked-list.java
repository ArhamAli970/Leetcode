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
    public ListNode removeZeroSumSublists(ListNode head) {
        Stack<Integer> preSum= new Stack<>();
        Stack<Integer> ele=new Stack<>();
        HashSet<Integer> h= new HashSet<>();
        ListNode curr=head;
        int pre=0;

        while(curr!=null){ 
           pre+=curr.val;
           if(h.contains(pre)){ 
               while(preSum.peek()!=pre){ 
                  ele.pop();
                   h.remove(preSum.pop());
               }
              pre=preSum.peek();
           }else if(pre==0){ 
               pre=0;
               h=new HashSet<>();
               ele=new Stack<>();
               preSum=new Stack<>();
           }else{ 
            //    pre+=curr.val;
               h.add(pre);
               preSum.push(pre);
               ele.push(curr.val);
           }
           curr=curr.next;
        }

head=null;
if(ele.isEmpty()){return head;}

head=new ListNode(ele.pop());

while(!ele.isEmpty()){ 
    ListNode l= new ListNode(ele.pop());
    l.next=head;
    head=l;
}

return head;

         

    }
}