class Solution {
    public boolean canTransform(String start, String result) {
        int l=0,r=0;

        for(int i=0;i<start.length();i++){
            char ch1=start.charAt(i),ch2=result.charAt(i);
            if(ch1=='L'){l--;}
            else if(ch1=='R'){r++;}
            if(l!=0 && r!=0){return false;}
            if(ch2=='L'){l++;}
            else if(ch2=='R'){r--;}
            if((l!=0 && r!=0) || l<0 || r<0){return false;}
        }
        
        return !(l!=0 || r!=0);
    }
}