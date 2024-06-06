class Solution {
    public boolean isNStraightHand(int[] hand, int gs) {

        if(hand.length%gs!=0){return false;}

        
        TreeMap<Integer,Integer> mp=new TreeMap<>();

        for(int i: hand){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }


        while(mp.size()>0){
            int val=mp.firstKey();
            int sz=gs;
            while(sz>0){
                if(!mp.containsKey(val)){return false;}
                mp.put(val,mp.get(val)-1);
                if(mp.get(val)==0){mp.remove(val);}
                --sz;
                ++val;
            }
        }

        return true;


    }
}