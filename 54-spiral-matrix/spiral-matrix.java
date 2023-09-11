class Solution {


public static boolean full(ArrayList<Integer> p , int size){ 
  if (p.size()==size){ 
    return true;
  }
  return false;
}


    public List<Integer> spiralOrder(int[][] matrix) {
       ArrayList<Integer> p= new ArrayList<>();
int t=0;
int size=matrix.length*matrix[0].length;
while(size!=p.size()){

    for(int j=0+t;j<matrix[0].length-t;j++){ 
      p.add(matrix[t][j]);
    }
if(full(p, size)){break;}

    for(int i=1+t;i<=matrix.length-2-t;i++){ 
      p.add(matrix[i][matrix[0].length-1-t]);
    }

    if(full(p, size)){break;}

    for (int j=matrix[0].length-1-t;j>=0+t;j--){ 
          p.add(matrix[matrix.length-1-t][j]);
    }


    if(full(p, size)){break;}
    
    for (int i=matrix.length-2-t;i>0+t;i--){ 
      p.add(matrix[i][0+t]);
    }

    if(full(p, size)){break;}

    t++;
  }
  return p ;
    }
}