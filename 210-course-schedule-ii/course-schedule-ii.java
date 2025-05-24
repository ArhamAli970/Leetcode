class Solution {
    static boolean noAns;
    public static void call(boolean chk[],boolean vis[],ArrayList<Integer> arr[],int i,Stack<Integer> st){
        if(vis[i] || noAns){return;}
        vis[i]=true;
        chk[i]=true;
        for(int j=0;j<arr[i].size();j++){
              int ed=arr[i].get(j);
              if(noAns || chk[ed]){noAns=true;return;}
              call(chk,vis,arr,ed,st);
        }
        chk[i]=false;
        st.push(i);

    }
    public int[] findOrder(int n, int[][] pre) {
       ArrayList<Integer> arr[]=new ArrayList[n];
       for(int i=0;i<n;i++){
          arr[i]=new ArrayList<>();
       }

       for(int i[]:pre){
          arr[i[1]].add(i[0]);
       }
       noAns=false;
       Stack<Integer> st=new Stack<>();

       boolean vis[]=new boolean[n];
       for(int i=0;i<n;i++){
           boolean chk[]=new boolean[n];
           call(chk,vis,arr,i,st);
           if(noAns){return new int[0];}
       }

       int a[]=new int[n];
       int idx=0;

       while(!st.isEmpty()){
         a[idx++]=st.pop();
       }

       return a;

    }
}