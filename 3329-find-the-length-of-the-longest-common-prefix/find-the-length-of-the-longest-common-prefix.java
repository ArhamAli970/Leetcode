class Solution {

    static class node{
        node arr[];
        boolean chk;
        node(){
            arr=new node[10];
            chk=false;
           
        }
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        
        node curr=new node();
// int char=10
        for(int i=0;i<arr1.length;i++){
            String word=String.valueOf(arr1[i]);
            node pre=curr;
            for(int j=0;j<word.length();j++){
                int chr=word.charAt(j)-'0';
                if(pre.arr[chr]==null){
                    pre.arr[chr]=new node();
                }
                pre=pre.arr[chr];
                if(j==word.length()-1){pre.chk=true;}
            }
        }

int max=0;
        for(int i=0;i<arr2.length;i++){
            String chkword=String.valueOf(arr2[i]);
            node pre=curr;
            int c=0;
            for(int j=0;j<chkword.length();j++){
                int chr=chkword.charAt(j)-'0';
                if(pre.arr[chr]==null){break;}
                else{pre=pre.arr[chr];}
                c++;
            }
            max=Math.max(c,max);
        }


        return max;


        


       

    }
}