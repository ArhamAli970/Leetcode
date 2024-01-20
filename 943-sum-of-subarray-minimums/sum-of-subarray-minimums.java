class Solution {

    static class node{
        int val,cnt;
        node(int val,int cnt){
            this.val=val;
            this.cnt=cnt;
        }
    }
    public int sumSubarrayMins(int[] arr) {

        Stack<node> st= new Stack<>();
        int md=1000000007;
        long sum=0,totSum=0;
        
        for(int i=arr.length-1;i>=0;i--){ 
            int cnt=0;
            sum=(sum+arr[i])%md;

            while(!st.isEmpty() && st.peek().val>=arr[i]){
                node curr=st.pop();
                cnt+=curr.cnt;
                sum-=(curr.cnt*curr.val);
                sum=((sum+(curr.cnt*arr[i])%md)%md);
            }

            st.push(new node(arr[i],cnt+1));
            totSum=(totSum+sum)%md;

        }

return (int)totSum;
        
    }
}