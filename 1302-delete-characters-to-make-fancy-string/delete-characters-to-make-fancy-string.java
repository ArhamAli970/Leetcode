class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int c=0;char ch='A';
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr!=ch){ch=curr;c=1;}
            else{
                c++;
            }

            if(c<3){sb.append(curr);}
        }

        return sb.toString();
    }
}