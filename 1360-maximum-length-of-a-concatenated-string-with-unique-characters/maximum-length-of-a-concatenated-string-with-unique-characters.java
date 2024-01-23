class Solution {
    static int max;
    public static boolean chkUniq(String res){
        int arr[]= new int[26];
        for(int i=0;i<res.length();i++){
            ++arr[res.charAt(i)-'a'];
            if(arr[res.charAt(i)-'a']>1){return false;}
        }

        return true;
    }
    public static void call(String res,List<String> arr,int idx){
        if(idx==arr.size()){
            if(chkUniq(res)){
               max=Math.max(res.length(),max);
            }
            return;
        }

        call(res+arr.get(idx),arr,idx+1);
        call(res,arr,idx+1);
    }
    public int maxLength(List<String> arr) {
        max=0;
        call("",arr,0);
        return max;
    }
}