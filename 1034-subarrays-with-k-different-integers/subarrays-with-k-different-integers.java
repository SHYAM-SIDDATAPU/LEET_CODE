class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return fun(nums,k)-fun(nums,k-1);
    }
    int fun(int[] nums,int k){
        HashMap<Integer,Integer> h=new HashMap<>();
        int i=0,j=0,r=0;
        while(j<nums.length){
          h.put(nums[j],h.getOrDefault(nums[j],0)+1);
          while(h.size()>k){
            h.put(nums[i],h.get(nums[i])-1);
            if(h.get(nums[i])==0) h.remove(nums[i]);
            i++;
          }
          r+=j-i+1;
          j++;
        }
        return r;
    }
}