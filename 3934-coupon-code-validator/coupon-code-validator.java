class Solution {
    public static boolean chk_buis(String b){
        return b.equals("electronics") || b.equals("grocery")|| b.equals("pharmacy") || b.equals("restaurant");
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        // list list  + validate cod[i] Character.isalnum(c) || c==_  ,line(4 cat) 

        List<List<String>> arr=new ArrayList<>();
        for(int i=0;i<code.length;i++){
            if(chk_buis(businessLine[i]) && isActive[i]){
                if(code[i].length()==0){continue;}
                boolean chk=true;
                for(int j=0;j<code[i].length();j++){
                    char c=code[i].charAt(j);
                    if(c!='_' && !Character.isLetterOrDigit(c)){
                        chk=false;break;
                    }
                }
                if(chk){
                    arr.add(new ArrayList<>());
                    arr.get(arr.size()-1).add(businessLine[i]);
                    arr.get(arr.size()-1).add(code[i]);
                }
            }
        } 

        Collections.sort(arr,(a,b)->{
            int cpl= a.get(0).charAt(0)-b.get(0).charAt(0);
            if(cpl==0){
                return a.get(1).compareTo(b.get(1));
            }
            return cpl;
         });
        List<String> ans=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            ans.add(arr.get(i).get(1));
        }

        return ans;
        // ans.add(ks.get(u).get(0)) if isactive
    }
}