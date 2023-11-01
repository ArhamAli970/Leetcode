class Solution {
    public int maxDiff(int num) {
        
        int init=num;
        ArrayList<Integer> a= new ArrayList<>();
         
        while(num>0){
         a.add(0,num%10);
         num/=10;
        }
        
        
     int val1=-1,v1=0;
        int sum2=0,sum1=0;
        // System.out.print(a.get(i));
    
        
        if(a.get(0)!=1){val1=a.get(0);v1=1;}
        else{
        int j=1;
        while(j<a.size() && (a.get(j)==0||a.get(j)==1)){v1=0;j++;}
        if(j<a.size())val1=a.get(j);
        }
        
        
        if(val1!=-1){
        for(int i=0;i<a.size();i++){ 
             
            int v= a.get(i)==val1?v1:a.get(i);
            sum1=sum1*10+v;
            
        }
        }
        
        int j=0,val2=-1;
        while(j<a.size() && a.get(j)==9){j++;}
        if(j<a.size()){val2=a.get(j);}
        
        if(val2!=-1){
        for(int i=0;i<a.size();i++){ 
        
            int v= a.get(i)==val2?9:a.get(i);
            sum2=sum2*10+v;
            
        }}
        
        if(sum2==0){sum2=init;}
        if(sum1==0){sum1=init;}
        
        return sum2-sum1;
        
        
    }
}