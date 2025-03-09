class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {

        int n=colors.length;
        int i=0,lst=colors[0]==1?0:1,cnt=0,j=0;

        while(i<n){
            if(lst==colors[j]){
                if(i>j){break;}
                i=j;
            }
            else{lst=colors[j];}
            if((i<j && j-i+1==k) || (j<i && n-i+j+1==k)){cnt++;i++;}
            j=(j+1)%n;
        }

        return cnt;
        
        
    }
}