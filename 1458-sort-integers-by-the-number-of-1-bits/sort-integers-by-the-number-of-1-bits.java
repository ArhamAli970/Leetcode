class Solution {
    public int[] sortByBits(int[] arr) {
        
        int n=arr.length;
        int ans[][]=new int[n][2];

        for(int i=0;i<n;i++){ 
             int val=arr[i],cnt=0;
             while(val>0){ 
                 if((val&1)!=0)cnt++;
                 val>>=1;
             }
             ans[i][0]=arr[i];
             ans[i][1]=cnt;
        }

        // for(int i=0;i<n;i++){ 
        //     System.out.print(ans[i][0]+" "+ans[i][1]);
        // }


        Arrays.sort(ans,(a,b)->{ 
            if(a[1]==b[1]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });

        for(int i=0;i<n;i++){ 
            arr[i]=ans[i][0];
        }

        return arr;





    }
}