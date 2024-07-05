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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int [] ans= new int[2];

        int fs=100000000,ls=0,last=-1000000000,c=0;
        ans[0]=Integer.MAX_VALUE;

        int cnt=2;
        ListNode h=head.next,prev=head;

        while(h.next!=null){
            if((prev.val>h.val && h.next.val>h.val) || (prev.val<h.val && h.val>h.next.val) ){
                c++;
                fs=Math.min(cnt,fs);
                ls=Math.max(cnt,ls);
                ans[0]=Math.min(ans[0],cnt-last);
                last=cnt;

            }

            h=h.next;
            prev=prev.next;

            cnt++;
        }

        if(c<2){
            ans[0]=-1;ans[1]=-1;
        }

        else{
            ans[1]=ls-fs;
        }
return ans;

          
    }
}