class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashMap<Integer,HashSet<Integer>> mp=new HashMap<>();
        int ans[]=new int[2];
        int plate[]={1,1,-1,-1};


        int plateIdx=0,dirIdx=1;
        for(int i=0;i<obstacles.length;i++){
            if(!mp.containsKey(obstacles[i][0])){
                mp.put(obstacles[i][0],new HashSet<>());
            }
            mp.get(obstacles[i][0]).add(obstacles[i][1]);
        }

        int fin=0;

        for(int i=0;i<commands.length;i++){
            if(commands[i]==-1){
                plateIdx=(plateIdx+1)%4;
                dirIdx=(dirIdx+1)%2;
            }
            else if(commands[i]==-2){
                plateIdx=(4+plateIdx-1)%4;
                dirIdx=(2+dirIdx-1)%2;
            }
            else{
                int dis=commands[i];
                while(dis>0){
                    int x=ans[0],y=ans[1];
                ans[dirIdx]+=plate[plateIdx];
                if(mp.containsKey(ans[0]) && mp.get(ans[0]).contains(ans[1])){
                    ans[0]=x;ans[1]=y;
                    break;
                }
                
                
                fin=Math.max(fin,ans[0]*ans[0]+ans[1]*ans[1]);

                dis--;

                }
            }
        }


        return fin;

        
    }
}