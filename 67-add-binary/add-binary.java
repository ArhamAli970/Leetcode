class Solution {
    public String addBinary(String a, String b) {
        
        int i=a.length()-1,j=b.length()-1, c=0;
        StringBuilder sb=new StringBuilder();

        while(i>=0 || j>=0){

            int sum1=i>=0?a.charAt(i)-'0':0;
            int sum2=j>=0?b.charAt(j)-'0':0;

            if(c==1 && sum1==1){
                c=1;sum1=0;
            }else{
                sum1+=c;
                c=0;
            }

            if(sum1==1 && sum2==1){
                c=1;sum1=0;
            }else{
                sum1+=sum2;
            }

            sb.append(String.valueOf(sum1));

            i--;j--;

        }



if(c==1){sb.append('1');}

return sb.reverse().toString();


    }
}