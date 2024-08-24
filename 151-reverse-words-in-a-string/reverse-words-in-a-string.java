class Solution {
    public String reverseWords(String s) {
        StringBuilder sb= new StringBuilder();
        String str=s.trim();
        String arr[]=str.split(" ");

        // System.out.print(arr.length);

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length()!=0){
                sb.append(arr[i]);
                if(i!=0){sb.append(" ");}
            }
            
        }

        return sb.toString();

    }
}