class Solution {
    public String removeKdigits(String num, int k) {

        if(num.length()==k){return "0";}

        Stack<Character> st= new Stack<>();
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<num.length();i++){
            while(k>0 && !st.isEmpty() && num.charAt(i)<st.peek()){
                st.pop();k--;
            }
            
            if(num.charAt(i)!='0'){
            st.push(num.charAt(i));
            }else{
                if(st.size()!=0){st.push(num.charAt(i));}
            }
            
        }

        while(!st.isEmpty() && k>0){
            st.pop();k--;
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }



        return sb.isEmpty()?"0":sb.reverse().toString();


        
    }
}