class Solution {
    public int minLength(String s) {
        
        Stack<Character> st= new Stack<>();
        
        for(int i=s.length()-1;i>=0;i--){ 
          
            if(!st.isEmpty() && s.charAt(i)=='C' && st.peek()=='D'){ 
              st.pop();
            }
            else if(!st.isEmpty() && s.charAt(i)=='A' && st.peek()=='B'){ 
              st.pop();
            }
            else{
            st.push(s.charAt(i));
        
            }
        }
        
       
        return st.size();
    
        
        
    }
}