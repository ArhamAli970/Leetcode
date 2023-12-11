class Solution {
    public int minSwaps(String s) {
        int n=s.length(),i=0;
        Stack<Character> st=new Stack<>();

        while(i<n){ 

            if(s.charAt(i)=='['){st.push(s.charAt(i));}

            else{
                if(!st.isEmpty() && st.peek()!=']'){ 
                    st.pop();
                }else{ 
                    st.push(']');
                }
            }
i++;
        }
int cnt=st.size()/2;
System.gc();
return cnt%2==0?cnt/2:(cnt/2)+1;


    }
}