class Solution {
    public boolean isNStraightHand(int[] hand, int gp) {

        TreeMap<Integer,Integer> mp=new TreeMap<>();

        for(int i=0;i<hand.length;i++){
            mp.put(hand[i],mp.getOrDefault(hand[i],0)+1);
        }

        
        while(mp.size()>=gp){
            int val=mp.firstKey(),sz=gp;
            while(mp.containsKey(val) && sz>0){
                sz--;
                mp.put(val,mp.get(val)-1);
                if(mp.get(val)==0){mp.remove(val);}
                val++;
            }

            if(sz>0){
                return false;
            }
        }

        return mp.size()==0;

    }
}