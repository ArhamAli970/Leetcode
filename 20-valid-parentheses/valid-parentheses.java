class Solution {
    public static boolean chk(char pk,char curr){

        return (pk==')' && curr=='(') || (pk=='}' && curr=='{') || (pk==']' && curr=='[');

    }

    public boolean isValid(String s) {
      Stack<Character> st= new Stack<>();

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==')' || ch=='}' || ch==']'){
                st.push(ch);
            }

            else{
                char c=st.isEmpty()?';':st.peek();
                if(st.isEmpty() || !chk(c,ch)){
                    return false;
                }else{
                    st.pop();
                }
            }

        }

return  st.isEmpty();

    }
}