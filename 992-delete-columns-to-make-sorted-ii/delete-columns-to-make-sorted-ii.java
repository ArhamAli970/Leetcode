class Solution {
    public static String makeStr(String[] str,HashSet<Integer> h,int idx,int lim){
        StringBuilder sb=new StringBuilder();
        for(int k=0;k<lim;k++){
            if(h.contains(k)){continue;}
            sb.append(str[idx].charAt(k));
        }

        return sb.toString();
    }
    public int minDeletionSize(String[] strs) {
        int i=0,cnt=0;
        HashSet<Integer> h=new HashSet<>();
        for(i=0;i<strs[0].length();i++){
            boolean nxt=false;
            for(int j=1;j<strs.length;j++){
                String lstStr=makeStr(strs,h,j-1,i);
                String currStr=makeStr(strs,h,j,i);
                if(lstStr.equals(currStr)){
                char curr=strs[j].charAt(i);
                char lst=strs[j-1].charAt(i);
                if(curr-lst<0){h.add(i);nxt=true;break;}
                else if(curr-lst==0){nxt=true;}
                }
            }
            if(!nxt){return h.size();}
        }

        return h.size();
    }
}