class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> IncoCity=new HashSet<>();
        for(int i=0;i<paths.size();i++){
            IncoCity.add(paths.get(i).get(0));
        }

        for(int i=0;i<paths.size();i++){
            if(!IncoCity.contains(paths.get(i).get(1))){ 
                return paths.get(i).get(1);
            }
        }

        return "";


    }
}