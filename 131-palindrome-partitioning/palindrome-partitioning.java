class Solution {
    static ArrayList<String> l;
    static List<List<String>> ans;

    public static boolean checkPal(){
        for(int i=0;i<l.size();i++){

                    if(l.get(i).length()%2==0){
                        int j=(l.get(i).length()/2)-1;
                        int k=l.get(i).length()/2;
                         while(j>=0 && k<l.get(i).length()){
                            if(l.get(i).charAt(j)!=l.get(i).charAt(k)){
                                return false;
                            }
                            j--;k++;
                        }
                    } 
                    

                    else{
                        int j=(l.get(i).length()/2)-1;
                        int k=(l.get(i).length()/2)+1;
                        while(j>=0 && k<l.get(i).length()){
                            if(l.get(i).charAt(j)!=l.get(i).charAt(k)){
                                return false;
                            }
                            j--;k++;
                        }
                    }


        }

        return true;
    }

    public static void call(String res,int idx,String s){
        if(idx==s.length()){
            l.add(res);
            if(checkPal()){
                ans.add(new ArrayList<>());
                for(int i=0;i<l.size();i++){
                    ans.get(ans.size()-1).add(l.get(i));
                }
            }
            l.remove(l.size()-1);

            return;
        }

        call(res+s.charAt(idx),idx+1,s);
        if(res.length()!=0){
        l.add(res);
        call(""+s.charAt(idx),idx+1,s);
        l.remove(l.size()-1);
        }



    }


    public List<List<String>> partition(String s) {

        l=new ArrayList<>();
        ans=  new ArrayList<>();

        call("",0,s);

        return ans;

        
    }
}