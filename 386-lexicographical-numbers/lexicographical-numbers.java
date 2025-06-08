class Solution {
    static List<Integer> ans;

    public static void call(int num,int lim){

        for(int i=num==0?1:0;i<10;i++){
            int curr=num+i;
            if(curr>lim){break;}
            else{ans.add(curr);}
            call(curr*10,lim);
        }

        
    }

    public List<Integer> lexicalOrder(int n) {
        ans=new ArrayList<>();

        // for(int i=1;i<10;i++){
        //     if(i>n){break;}
        //     else{ans.add(i);}
            call(0,n);
        // }

        return ans;

    }
}