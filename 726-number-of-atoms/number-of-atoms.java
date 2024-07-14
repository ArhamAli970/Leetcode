class Solution {
    static int n,mul;
    static StringBuilder form;
    static TreeMap<String,Integer> mp;
    public static int Bal(String s,int idx){
        int cnt=1;
        while(cnt>0){
            if(s.charAt(idx)==')'){cnt--;}
            else if(s.charAt(idx)=='('){cnt++;}
            idx++;
        }

        if(idx>=n || !Character.isDigit(s.charAt(idx))){return 1;}
        int num=0;
        while(idx<n && Character.isDigit(s.charAt(idx))){
            num=num*10+(s.charAt(idx)-'0');
            idx++;
        }

        return num;
        

    }

    public static void chk(StringBuilder s){
        if(form.length()!=0){
                String str=form.toString();
                mp.put(str,mp.getOrDefault(str,0)+mul);
                form=new StringBuilder();
        }
    }

    public String countOfAtoms(String s) {
        n=s.length();mul=1;
        mp=new TreeMap<>();
        form=new StringBuilder();


        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                chk(form);
                mul*=Bal(s,i+1);
            }

            else if(s.charAt(i)==')'){
                chk(form);
                int num=0;
                i++;
                while(i<n && Character.isDigit(s.charAt(i))){
                        num=num*10+(s.charAt(i)-'0');
                        i++;
                }
                mul=mul/(num==0?1:num);
                i--;

            }

            else if(s.charAt(i)-'A'>=0 && 'Z'-s.charAt(i)>=0){
                chk(form);
                form.append(s.charAt(i)); 
            }

            else if(s.charAt(i)-'a'>=0 && 'z'-s.charAt(i)>=0){
                form.append(s.charAt(i));
            }

            else if(Character.isDigit(s.charAt(i))){
                int num=0;
                while(i<n &&  Character.isDigit(s.charAt(i))){
                    num=num*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;

               
                int fin=num*mul;
                // System.out.print(fin+" ");
                String str=form.toString();
                mp.put(str,mp.getOrDefault(str,0)+fin);
                form=new StringBuilder();

            }
            
            
 

// System.out.print(mp);
        }

        chk(form);


        for(Map.Entry<String,Integer> e:mp.entrySet()){
            form.append(e.getKey());
            if(e.getValue()>1){
            form.append(String.valueOf(e.getValue()));
            }
        }

        return form.toString();


        
    }
}