class WordDictionary {
static HashSet<String> h;
    public WordDictionary() {
        h= new HashSet<>();
    }
    
    public void addWord(String word) {
        h.add(word);
    }
    
    public boolean search(String word) {
          int cnt=0,idx1=-1,idx2=-1;
          for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='.'){
                if(idx1==-1){idx1=i;}
                else{idx2=i;}
            }
          }

          if(idx1==-1 && idx2==-1){
            return h.contains(word);
          }

          if(idx2==-1){
              for(int i=0;i<26;i++){
                 String str=word.substring(0,idx1)+(char)(i+97)+word.substring(idx1+1);
                 if(h.contains(str)){return true;}
              }
              return false;
          }


          for(int i=0;i<26;i++){

             String str=word.substring(0,idx1)+(char)(i+97)+word.substring(idx1+1);

             for(int j=0;j<26;j++){
                str=str.substring(0,idx2)+(char)(j+97)+str.substring(idx2+1);
                if(h.contains(str)){return true;}
             }
              
          }

          return false;



    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */