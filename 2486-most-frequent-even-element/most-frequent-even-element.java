class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i:nums){
            if(i%2==0) h.put(i,h.getOrDefault(i,0)+1);
        }
        int v=100000;
        int m=0;
        for(Integer i:h.keySet()){
            if(h.get(i)>m)
             m=h.get(i);
        }
        if(m==0) return -1;
        for(Integer i:h.keySet()){
            if(h.get(i)==m){
                v=i<v?i:v;
            }
        }
        return v;
    }
}