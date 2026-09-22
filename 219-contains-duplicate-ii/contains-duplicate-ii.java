class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h= new HashMap<>();
        boolean t=false;
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                if(i-h.get(nums[i])<=k)
                t= true;
            }
            h.put(nums[i],i);
        }
        return t;
    }
}