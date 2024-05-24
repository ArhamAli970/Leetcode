class Solution {
    static int cnt[];
    static int max;


public static boolean req(String word){
    int get[]=new int[26];
    for(int i=0;i<word.length();i++){
        ++get[word.charAt(i)-'a'];
    }

    for(int i=0;i<26;i++){
        if(get[i]>cnt[i]){return false;}
    }
    return true;
}

public static int getScore(String word,int score[]){
    int sc=0;
    for(int i=0;i<word.length();i++){
        sc+=score[word.charAt(i)-'a'];
        --cnt[word.charAt(i)-'a'];
    }
    
    return sc;
}

public static void removeScore(String word){
    for(int i=0;i<word.length();i++){
        ++cnt[word.charAt(i)-'a'];
    }
}


public static void call(int i,String[]  words,int score[],int sc){
    if(i==words.length){
        max=Math.max(sc,max);
        return;
    }

    call(i+1,words,score,sc);

    if(req(words[i])){
        int sc1=getScore(words[i],score);
        call(i+1,words,score,sc+sc1);
        removeScore(words[i]);
    }



}



    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        cnt=new int[26];
        max=0;
        for(int i=0;i<letters.length;i++){
            ++cnt[letters[i]-'a'];
        }


        call(0,words,score,0);

        return max;



    }
}