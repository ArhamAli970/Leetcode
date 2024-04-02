class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> mp1= new HashMap<>();
        HashMap<Character,Character> mp2= new HashMap<>();


        for(int i=0;i<s.length();i++){
            if(!mp1.containsKey(s.charAt(i)) && !mp2.containsKey(t.charAt(i))){
                mp1.put(s.charAt(i),t.charAt(i));
                mp2.put(t.charAt(i),s.charAt(i));
            }

            else if(mp1.containsKey(s.charAt(i))){
                if(mp1.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }

            else if(mp2.containsKey(t.charAt(i))){
                if(mp2.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }




        }
        return true;
    }
}