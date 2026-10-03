class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> h= new HashMap<>();
        for(char i:s.toCharArray()) h.put(i,h.getOrDefault(i,0)+1);
        List<Character> l= new ArrayList<>(h.keySet());
        l.sort((a,b)->h.get(b)-h.get(a));
        StringBuilder sb= new StringBuilder();
        for(char i:l)
            for(int j=0;j<h.get(i);j++)
                sb.append(i);
        return sb.toString();
    }
}