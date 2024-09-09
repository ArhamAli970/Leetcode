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
    public int[][] spiralMatrix(int n, int m, ListNode head) {
        
        int ans[][]=new int[n][m];
        for(int i[]:ans){
            Arrays.fill(i,-1);
        }

        int k=0;

        while(head!=null){
            int j=k;
            while(j<m-k){
                ans[k][j]=head.val;
                if(head.next==null){return ans;}
                head=head.next;j++;
            }

            int i=1+k;
            while(i<n-k-1){
                ans[i][m-k-1]=head.val;
                if(head.next==null){return ans;}
                head=head.next;i++;
            }


            j=m-1-k;
            while(j>=k){
                ans[n-k-1][j]=head.val;
                if(head.next==null){return ans;}
                head=head.next;j--;
            }

            i=n-k-2;
            while(i>k){
                ans[i][k]=head.val;
                if(head.next==null){return ans;}
                head=head.next;i--;
            }
k++;

        }

        return ans;

    }
}