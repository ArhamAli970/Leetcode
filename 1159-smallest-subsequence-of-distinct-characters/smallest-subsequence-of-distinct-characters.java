class Solution {
    public String smallestSubsequence(String s) {

        int lst[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            lst[s.charAt(i)-'a']=i;
        }

        Stack<Character> st= new Stack<>();
        HashSet<Character> h= new HashSet<>();

        for(int i=0;i<s.length();i++){
            if(h.contains(s.charAt(i))){continue;}
            while(!st.isEmpty() && st.peek()>s.charAt(i) && lst[st.peek()-'a']>i){
                h.remove(st.pop());
            }
            st.push(s.charAt(i));h.add(s.charAt(i));
            
        }
        
StringBuilder sb = new StringBuilder();

while(!st.isEmpty()){
    sb.append(st.pop());
}

return sb.reverse().toString();

    }
}