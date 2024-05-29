class Solution {
    public int numSteps(String s) {
        s='0'+s;
        int cnt=0,n=s.length();

        int cnt1=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){cnt1++;}
        }

        

        char arr[]=s.toCharArray();

        while(cnt1>1 || arr[n-1]!='1'){
            cnt++;
            if(arr[n-1]=='0'){
                char prev='0';
                int i=0;
                for(i=0;i<n-1;i++){
                    char curr=arr[i];
                    arr[i]=prev;
                    prev=curr;
                }

                arr[i]=prev;
            }else{
                int idx=n-1;
                while(idx>=0 && arr[idx]!='0'){
                    arr[idx]='0';
                    cnt1--;
                    idx--;
                   
                }
               if(idx>=0){arr[idx]='1';cnt1++;}
               
            }
        }

        

        return cnt;


    }
}