class Solution {

    public static void replace(int st,int end,char arr[]){
        while(st<end){
            if(arr[st]==')' || arr[st]=='('){st++;}
            else if(arr[end]==')' || arr[end]=='('){end--;}
            else {
               char ch=arr[st];
               arr[st]=arr[end];
               arr[end]=ch;
               st++;
               end--;
            }

        }

    } 

    public String reverseParentheses(String s) {
        Stack<Integer> st= new Stack<>();
        int n=s.length();

        char arr[]=s.toCharArray();

        for(int i=0;i<n;i++){

            if(arr[i]=='('){st.push(i);}
            else if(arr[i]==')'){
                replace(st.pop(),i,arr);
            }


        }


        StringBuilder sb=new StringBuilder();

        for(int i=0;i<arr.length;i++){
            if(arr[i]-'a'>=0 && 'z'-arr[i]>=0){sb.append(arr[i]);}
        }

        return sb.toString();




    }
}