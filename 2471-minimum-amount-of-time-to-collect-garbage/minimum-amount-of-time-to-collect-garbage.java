class Solution {

public static int call(String[] garbage,int[] travel,char occ){ 
int lastOccurence=-1,cnt=0;
for(int i=0;i<garbage.length;i++){ 
    for (int j=0;j<garbage[i].length();j++){ 
        if(garbage[i].charAt(j)==occ){
            lastOccurence=i;
            cnt++;
        }
    }
}

if(lastOccurence==-1){return 0;}
if(lastOccurence==0){return cnt;}

return cnt+travel[lastOccurence-1];

}

    public int garbageCollection(String[] garbage, int[] travel) {
        

for(int i=1;i<travel.length;i++){ 
         travel[i]+=travel[i-1];
}

return call(garbage,travel,'G')+call(garbage,travel,'P')+call(garbage,travel,'M');


    }
}