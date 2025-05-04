class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer,HashMap<Integer,Integer>> mp=new HashMap<>();
        int cnt=0;
        for(int i[]:dominoes){
            int num1=i[0]>i[1]?i[1]:i[0];
            int num2=i[1]>i[0]?i[1]:i[0];
            if(!mp.containsKey(num1)){
                mp.put(num1,new HashMap<>());
                mp.get(num1).put(num2,1);
            }
            else if(!mp.get(num1).containsKey(num2)){
                mp.get(num1).put(num2,1);
            }else{
                cnt+=mp.get(num1).get(num2);
                mp.get(num1).put(num2,mp.get(num1).getOrDefault(num2,0)+1);
            }
        }

        return cnt;
    }
}