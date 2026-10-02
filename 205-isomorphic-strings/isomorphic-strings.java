class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1= new HashMap<>();
        HashMap<Character,Character> h2= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(h1.containsKey(a) && h1.get(a)!=b) return false;
            if(h2.containsKey(b) && h2.get(b)!=a) return false;
            h1.put(a,b);
            h2.put(b,a);
        }
        return true;
    }
}