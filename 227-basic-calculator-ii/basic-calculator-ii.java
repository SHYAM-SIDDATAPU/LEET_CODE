class Solution {
    static int pr(String c){
        if(c.equals("+")|| c .equals("-")) return 1;
        if(c.equals("*")|| c .equals("/")) return 2;
        return 0;
    }
    public int calculate(String s) {
        String t1="";
        List<String> str= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(Character.isDigit(c)) t1+=String.valueOf(c);
            else if(c=='+'|| c=='-'|| c=='*'|| c=='/'){
                str.add(t1);
                t1="";
                str.add(String.valueOf(c));
            }
            else continue;
        }
        str.add(t1);

       Stack<String> st= new Stack<>();
       List<String> str1= new ArrayList<>();
       for(int i=0;i<str.size();i++){
        String t= str.get(i);
        if(t.equals("+")||t.equals("-")||t.equals("/")||t.equals("*")){
            
            while(!st.isEmpty() && pr(t)<=pr(st.peek())){
               str1.add(st.pop());
            }
            st.push(t);
            
        }
        else{
            str1.add(t);
        }
       }
     while(!st.isEmpty()) str1.add(st.pop());

     for(int i=0;i<str1.size();i++){
        String t= str1.get(i);
        if(t.equals("+")||t.equals("-")||t.equals("/")||t.equals("*")){
            int b=Integer.parseInt(st.pop());
            int a=Integer.parseInt(st.pop());
            if(t.equals("+")){
                st.push(String.valueOf(a+b));
            }
            else if(t.equals("-")){
                st.push(String.valueOf(a-b));
            }
            else if(t.equals("*")){
                st.push(String.valueOf(a*b));
            }
            else{
                if(b==0) st.push("0");
                st.push(String.valueOf(a/b));
            }
        }
        else{
            st.push(t);
        }

     }
     return Integer.parseInt(st.pop());
     
    }
}