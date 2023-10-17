class Solution {
    static int res[];
    static int cnt;
    static boolean vis[];
    public static boolean bfs(int curr,int[] leftChild, int[] rightChild){ 

         Queue<Integer> q= new LinkedList<>();
         HashSet<Integer> h= new HashSet<>();
         

         q.add(curr);

         while(!q.isEmpty()){ 
            int c=q.remove();
            vis[c]=true;
            h.add(c);
            if(  (leftChild[c]!=-1 && rightChild[c]!=-1) && leftChild[c]==rightChild[c]){ 
                return false;
            }
           
             if( (leftChild[c]!=-1 && res[leftChild[c]]!=-1) || (rightChild[c]!=-1  && res[rightChild[c]]!=-1 ) ){return false;}

             if(leftChild[c]!=-1){ 
                 if(h.contains(leftChild[c])){return false;}
                 res[leftChild[c]]=c;
                 if(!vis[leftChild[c]]){q.add(leftChild[c]);;} 
                 cnt--;
                 
             }
             if(rightChild[c]!=-1){ 
                if(h.contains(rightChild[c])){return false;}
                 res[rightChild[c]]=c;
                 if(!vis[rightChild[c]]){q.add(rightChild[c]);}
                 cnt--;
                
             }



         }


         return true;

    }

    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {

        res=new int[n];
        Arrays.fill(res,-1);
        cnt=n;
        vis=new boolean[n];
    

        for(int i=0;i<n;i++){ 
            if(res[i]==-1){ 
                if(!bfs(i,leftChild,rightChild)){ 
                    return false;
                }
            }
        }

        // System.out.print(cnt);
        if(cnt !=1){return false;}
        return true;

        
    }
}