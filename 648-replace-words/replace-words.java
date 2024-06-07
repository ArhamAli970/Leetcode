class Solution {
    public String replaceWords(List<String> dict, String sentence) {

        HashSet<String> h=new HashSet<>();
        int max=0;

        for(int i=0;i<dict.size();i++){
            h.add(dict.get(i));
            max=Math.max(dict.get(i).length(),max);
        }

        // System.out.print(max);

        // System.out.print(h);

        StringBuilder sb= new StringBuilder();
        String arr[]=sentence.split(" ");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<Math.min(max,arr[i].length());j++){
                 if(h.contains(arr[i].substring(0,j+1))){
                      arr[i]=arr[i].substring(0,j+1);
                      break;
                 }           
            } 

        }

        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            if(i==arr.length-1){break;}
            sb.append(" ");
        }

        return sb.toString();

        
    }
}