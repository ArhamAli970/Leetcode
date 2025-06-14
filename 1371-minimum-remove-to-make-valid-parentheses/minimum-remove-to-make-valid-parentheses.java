class Solution {
    public String minRemoveToMakeValid(String s) {
        
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!st.isEmpty() && s.charAt(st.peek())==')'){st.pop();}
                else{st.push(i);}
            }else if(ch==')'){
                st.push(i);
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(!st.isEmpty() && st.peek()==i){st.pop();}
            else{sb.append(s.charAt(i));}
        }
        
        return sb.toString();
        
    }
}