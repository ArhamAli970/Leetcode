class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> st= new Stack<>();

        for(int i=s.length()-1;i>=0;i--){
             if(s.charAt(i)!='(' && s.charAt(i)!=')'){continue;}

            else if(s.charAt(i)==')'){st.push(i);}

            else{
                 if( !st.isEmpty() && s.charAt(st.peek())==')'){st.pop();}
                 else{st.push(i);}
            }

        }

StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()==i){st.pop(); continue;}
            else{
                while(!st.isEmpty() && i>=st.peek()){st.pop();}
                sb.append(s.charAt(i));
            }
        }


        return sb.toString();
        
    }
}