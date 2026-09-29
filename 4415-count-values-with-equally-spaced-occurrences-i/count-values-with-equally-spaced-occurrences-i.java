class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int c=0;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(nums[i]==nums[j] && h.get(nums[i])==3 && 2*j-i<n)
                    if(nums[2*j-i]==nums[j]) c++;
        return c;
    }
}