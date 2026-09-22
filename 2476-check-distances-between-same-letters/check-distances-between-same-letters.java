class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> h= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                if(i-h.get(s.charAt(i))-1!=distance[s.charAt(i)-'a'])
                 return false;
            }
            h.put(s.charAt(i),i);
        }
        return true;
    }
}