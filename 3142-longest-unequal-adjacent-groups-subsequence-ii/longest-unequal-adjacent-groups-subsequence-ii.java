class Solution {

static List<String> ans;

public static boolean isCondition(String word1,String word2,int i,int j,int[] groups){ 
    if(groups[i]==groups[j] || word1.length()!=word2.length()){return false;}

int cnt=0;
     for(int k=0;k<word1.length();k++){ 
         if(word1.charAt(k)!=word2.charAt(k)) cnt++;
         if(cnt>1){return false;}
     }

     return true;

}

public static void addToArrayList(ArrayList<Integer> sol, String words[]){ 

for(int i=sol.size()-1;i>=0;i--){ 
    ans.add(words[sol.get(i)]);
}


}

public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {

  

  ArrayList<Integer> a[]= new ArrayList[n];
  ans=new ArrayList<>();
   int max=1;

if(n==1){ 
 ans.add(words[0]);
 return ans;
}

  for(int i=0;i<n;i++){ 
      a[i]=new ArrayList<>();
      a[i].add(i);
  }

  for(int i=1;i<n;i++){ 
      int m=1,takeIdx=-1;
      for(int j=i-1;j>=0;j--){ 
            if(isCondition(words[i],words[j],i,j,groups)){ 
                   if(a[i].size()+a[j].size()>m){ 
                       m=a[i].size()+a[j].size();
                       takeIdx=j;
                   }
            }

          

      }
      if(takeIdx!=-1){max=Math.max(m,max);
      a[i].addAll(a[takeIdx]);}


  }


for(int i=n-1;i>=0;i--){ 
    if(a[i].size()==max){ 
          addToArrayList(a[i],words); break;
    }
}


  return ans;



    
    }
}