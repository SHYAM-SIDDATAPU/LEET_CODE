class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> h= new HashMap<>();
        int sum=0;
        for(int i:nums) h.put(i,h.getOrDefault(i,0)+1);
        for(Integer i:h.keySet()){
            if(h.get(i)%k==0) sum+=i*h.get(i);
        }
        return sum;
    }
}