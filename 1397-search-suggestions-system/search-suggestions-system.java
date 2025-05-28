class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        TreeSet<String> hp=new TreeSet<>();

        for(int i=0;i<products.length;i++){
             hp.add(products[i]);
        }

        List<List<String>>  ans=new ArrayList<>();

        for(int  i=0;i<searchWord.length();i++){
            HashSet<String> h=new HashSet<>();
            for(String str:hp){
                  if(i>=str.length() || searchWord.charAt(i)!=str.charAt(i)){
                       h.add(str);
                  }
            }

            for(String str:h){hp.remove(str);}

            int cnt=0;
            ans.add(new ArrayList<>());
            for(String str:hp){
                cnt++;
                ans.get(ans.size()-1).add(str);
                if(cnt==3){break;}
            }
        }

        return ans;
    }
}