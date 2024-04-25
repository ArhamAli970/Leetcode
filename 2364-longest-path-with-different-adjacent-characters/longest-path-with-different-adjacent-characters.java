class Solution {
    static int max;
    static ArrayList<Integer> arr[];

    public static int call(char par,int i,String s){
        if(arr[i].size()==0){return par==s.charAt(i)?0:1;}

        int sum=0,m=0,m1=0,m2=0;

        for(int j=0;j<arr[i].size();j++){
            int s1=call(s.charAt(i),arr[i].get(j),s);
            m=Math.max(m,s1);
            if(s1>m1){
                m2=m1;
                m1=s1;
            }else if(s1>m2){
                m2=s1;
            }

        }

        max=Math.max(m1+m2+1,max);

        return par==s.charAt(i)?0:m+1;

    }


    public int longestPath(int[] parent, String s) {
        int n=s.length();
        if(n==1){return 1;}
        arr=new ArrayList[n];

        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i=1;i<n;i++){
            arr[parent[i]].add(i);
        }
        max=0;

        call('$',0,s);

        return max;

        
    }
}