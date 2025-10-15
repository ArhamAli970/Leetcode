class Solution {
    public int longestValidParentheses(String s) {

        int n=s.length(),max=0;
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(1);
            }else{
                if(st.isEmpty()){st=new Stack<>();}
                else{
                    if(st.peek()==1){st.pop();st.push(2);}
                    else{
                        int tp=st.pop();
                        if(!st.isEmpty() && st.pop()==1){st.push(tp+2);}
                        else{st=new Stack<>();}
                    }
                    while(!st.isEmpty() && st.peek()>1){
                        int tp=st.pop();
                        if(!st.isEmpty() && st.peek()>1){st.push(tp+st.pop());}
                        else{st.push(tp);break;}
                    }
                    // System.out.println(st);
                    if(!st.isEmpty())max=Math.max(st.peek(),max);
                }
            }
        }

        return max;
        
    }
}