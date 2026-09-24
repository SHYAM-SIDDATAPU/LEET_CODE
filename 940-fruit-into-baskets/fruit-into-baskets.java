class Solution {
    public int totalFruit(int[] fruits) {
        int i=0,j=0,max=0;
        HashMap<Integer,Integer> h= new HashMap<>();
        while(j<fruits.length){
            h.put(fruits[j],h.getOrDefault(fruits[j],0)+1);
            if(h.size()>2){
                h.put(fruits[i],h.get(fruits[i])-1);
                if(h.get(fruits[i])==0) h.remove(fruits[i]);
                i++;
            }
            if(h.size()<=2)
               max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}