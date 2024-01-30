class Solution {
    public int evalRPN(String[] tokens) {

// remember one thing if there is expreseion a+b in rpn - > ab+;
// we have to take last two operator
        int n=tokens.length;
      Stack<Integer> st= new Stack<>();
      int leftToOperator=0;
      int rightToOperator=0;

      for(int i=0;i<n;i++){ 
          if(tokens[i].equals("+")){
                rightToOperator=st.pop();
                leftToOperator=st.pop();
                st.push(leftToOperator +  rightToOperator);
          }
          else if(tokens[i].equals("-")){ 
                rightToOperator=st.pop();
                leftToOperator=st.pop();
                st.push(leftToOperator -  rightToOperator);
          }
          else if(tokens[i].equals("/")){ 
                rightToOperator=st.pop();
                leftToOperator=st.pop();
                st.push(leftToOperator / rightToOperator);
            }
          else if(tokens[i].equals("*")){ 
                 rightToOperator=st.pop();
                leftToOperator=st.pop();
                st.push(leftToOperator *  rightToOperator);
          }
          else{ 
              st.push(Integer.parseInt(tokens[i]));
          }

      }

return st.pop();
    }
}