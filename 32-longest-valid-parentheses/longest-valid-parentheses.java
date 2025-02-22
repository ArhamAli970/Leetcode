class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> st=new Stack<>();
        int n=s.length(),sum=0,max=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==')'){
                if(!st.isEmpty() && st.peek()==-1){
                    sum+=2;
                    st.pop();
                }else{
                    sum=0;
                    st.clear();
                }
                if(!st.isEmpty() && st.peek()>0){sum+=st.peek();st.pop();}
            }else{
                if(sum>0){;
                st.push(sum);
                sum=0;
                }
                st.push(-1);
            }
            max=Math.max(sum,max);
        }


        return max;
        
    }
}