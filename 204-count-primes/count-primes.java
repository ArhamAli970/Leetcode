class Solution {
    static boolean prime[];

public static void sieveOfErathonoses(int n){ 
    for(int i=2;i<Math.sqrt(n);i++){ 

        for(int j=i*i;j<n;j+=i){

prime[j]=false;

        }

    }
}

    public int countPrimes(int n) {
        
        prime= new boolean[n];

        Arrays.fill(prime,true);


        sieveOfErathonoses(n);

int cnt=0;
        for(int i=2;i<n;i++){ 
            if(prime[i]) cnt++;
        }

return cnt;
    }
}