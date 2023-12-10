class Solution {

public static int power(int a,int b,int c,int d){ 

long ans=1;
while(b-->0){ 
ans=(ans*a)%10;
}


long po=1;
while(c-->0){ 
po=(ans*po)%d;
}

// System.out.print(ans);

return (int)po;





}

    public List<Integer> getGoodIndices(int[][] variables, int target) {
        
        List<Integer> as= new ArrayList<Integer>();
        int n=variables.length;

         

        
        for(int i=0;i<n;i++){ 
        
            int ans= power(variables[i][0],variables[i][1],variables[i][2],variables[i][3]);
            if(ans==target){as.add(i);}
            
        }
        
        return as;
        
    }
}