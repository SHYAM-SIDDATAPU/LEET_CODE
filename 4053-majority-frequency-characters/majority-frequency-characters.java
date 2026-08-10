class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer> h= new HashMap<>();
        for(char i: s.toCharArray()){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int i=1;
        List<String> l= new ArrayList<>();
        while(i<=s.length()){
            String s1="";
           for(char c:h.keySet()){
            if(h.get(c)==i){
                s1+=String.valueOf(c);
            }
           }
           if(!s1.equals("")) l.add(s1);

           i++;
        }
        String m="";
        for(String j:l){
            if(j.length()>=m.length())
            m=j;
        }
        return m;
    }
}