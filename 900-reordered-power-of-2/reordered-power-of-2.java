class Solution {
    static int cnt[];

    public static boolean chk(int arr[]){
        for(int i=0;i<10;i++){
            if(arr[i]!=cnt[i]){return false;}
        }

        return true;
    }

    public boolean reorderedPowerOf2(int n) {
        cnt=new int[10];

        while(n>0){
            ++cnt[n%10];
            n/=10;
        }

        for(int i=0;i<32;i++){
            int p=(int)Math.pow(2,i);
            int arr[]=new int[10];
            while(p>0){
                ++arr[p%10];
                p/=10;
            }
            if(chk(arr)){return true;}
        }


        return false;

        
    }
}