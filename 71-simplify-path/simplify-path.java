class Solution {
    public String simplifyPath(String path) {
            Stack<String> st= new Stack<>();
            String s="";


            for(int i=0;i<path.length();i++){
                if(path.charAt(i)!='/'){
                    s+=path.charAt(i);
                }
                if(i==path.length()-1 || path.charAt(i)=='/'){
                    if(s.length()==0 || s.equals(".")){s="";}
                    else if(s.equals("..")){
                        if(!st.isEmpty())st.pop();
                    }
                    else{st.push(s);}
                    s="";
                }
            }



            StringBuilder sb=new StringBuilder();
            int sz=st.size();
            String arr[]=new String[sz];

            while(!st.isEmpty()){
                s=st.pop();
                arr[sz-1]=s;
                sz--;
            }

           
            for(String i:arr){
                 sb.append('/');
                 sb.append(i);
            }

            return sb.isEmpty()?"/":sb.toString();


    }
}