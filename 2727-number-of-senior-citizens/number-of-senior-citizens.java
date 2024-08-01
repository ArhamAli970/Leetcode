class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(int i=0;i<details.length;i++){
            String ans=details[i].substring(11,13);
            if(Integer.valueOf(ans)>60){cnt++;}
        }

        return cnt;
    }
}