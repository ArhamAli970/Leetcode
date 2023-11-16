class Solution {
    static String ans;
     public static boolean checkLength(){ 
          return ans.length()>0;
      }

 
    public static void checkAvail( HashSet<String> h,String res){ 
        if(h.size()==res.length()){ 
           if(!h.contains(res)){ans=res;}
           return;
        }
          checkAvail(h,res+0);
         if(checkLength()){return;}
          checkAvail(h,res+1);
        if(checkLength()){return;}
          
        
    }

    public String findDifferentBinaryString(String[] nums) {
        
        ans="";
        HashSet<String> h= new HashSet<>();
        for(int i=0;i<nums.length;i++){ 
            h.add(nums[i]);
        }

        checkAvail(h,"");

        return ans;

    }
}