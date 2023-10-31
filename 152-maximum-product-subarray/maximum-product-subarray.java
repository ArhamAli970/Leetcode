class Solution {
    
    public int maxProduct(int[] arr) {
    
    int max=Integer.MIN_VALUE;
    int prod=1,lstProd=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){ 
        if(arr[i]!=0){ 
            prod*=arr[i];
            // System.out.print(prod+" ");
            max=Math.max(prod,Math.max(arr[i],max));
            if(prod<0 && lstProd!=Integer.MIN_VALUE){ 
                max=Math.max(prod/lstProd,max);
            }
            else if(prod<0 && lstProd==Integer.MIN_VALUE){ 
                lstProd=prod;
            }
        }
        else{
            max=Math.max(arr[i],max); 
            prod=1;
            lstProd=Integer.MIN_VALUE;
        }
    }

    return max;

    }
}