class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {

        HashMap<Integer,String[]> mp=new HashMap<>();
        for(int i=0;i<indices.length;i++){
            int j=indices[i];
            String chk=sources[i];
            int len=chk.length();
            if(j+len<=s.length() && s.substring(j,j+len).equals(chk)){
                mp.put(j,new String[]{chk,targets[i]});
            }
        }

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();){
            if(mp.containsKey(i)){
                String[] add=mp.get(i);
                sb.append(add[1]);
                i+=add[0].length();
            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();

    }
}