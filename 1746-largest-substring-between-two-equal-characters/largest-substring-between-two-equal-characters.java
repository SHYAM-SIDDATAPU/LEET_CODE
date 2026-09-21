class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int m=-1;
        HashMap<Character,Integer> h= new HashMap<>();
        for(int i=0;i<s.length();i++)
            if(h.containsKey(s.charAt(i)))
                m=Math.max(m,i-h.get(s.charAt(i))-1);
            else
                h.put(s.charAt(i),i);      
        return m;
    }
}