class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {

        String ans1[]=s1.split(" ");
        String ans2[]=s2.split(" ");
        int n=ans1.length,m=ans2.length;

        int i=0;

        while(i<Math.min(n,m) && ans1[i].equals(ans2[i])){
            i++;
        }

        if(i==n || i==m){return true;}

        int j=n-1,k=m-1;

        while(j>=i && k>=i && ans1[j].equals(ans2[k])){
            j--;k--;
        }

        return j<i || k<i;
        
    }
}