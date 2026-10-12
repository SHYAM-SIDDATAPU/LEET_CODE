class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h= new HashMap();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int sum=0;
        for(int i=1;i<s.length();i++){
            if(h.get(s.charAt(i-1))<h.get(s.charAt(i)))
            sum-=h.get(s.charAt(i-1));
            else 
            sum+=h.get(s.charAt(i-1));
        }
        sum+=h.get(s.charAt(s.length()-1));
        return sum;

    }
}